package br.edu.ifpb.dac.LauroDac.bussines.service;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;

import br.edu.ifpb.dac.LauroDac.bussines.security.TokenService;
import br.edu.ifpb.dac.LauroDac.model.entity.UserLogin;
import br.edu.ifpb.dac.LauroDac.model.repositories.UserRepository;
import br.edu.ifpb.dac.LauroDac.presentation.DTO.AuthetinticationDto;
import br.edu.ifpb.dac.LauroDac.presentation.DTO.LoginResponseDto;
import br.edu.ifpb.dac.LauroDac.presentation.DTO.RegisterDto;
import br.edu.ifpb.dac.LauroDac.presentation.DTO.TokenDTO;



@Service
public class AuthorizationService implements UserDetailsService{
    @Autowired
    private ApplicationContext context;
    
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TokenService tokenService;

    private AuthenticationManager authenticationManager;
    
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return userRepository.findByEmail(email);
    } 

    public ResponseEntity<Object> login(@RequestBody @Validated AuthetinticationDto data){
        authenticationManager = context.getBean(AuthenticationManager.class);

        var usernamePassword = new UsernamePasswordAuthenticationToken(data.email(), data.password());
        var auth = this.authenticationManager.authenticate(usernamePassword);
        var token = tokenService.generateToken((UserLogin) auth.getPrincipal());
        return ResponseEntity.ok(new LoginResponseDto(token));
        
    }


    public ResponseEntity<Object> register (@RequestBody RegisterDto registerDto){
        if (this.userRepository.findByEmail(registerDto.email()) != null ) return ResponseEntity.badRequest().build();
        String encryptedPassword = new BCryptPasswordEncoder().encode(registerDto.password());
        
        UserLogin newUser = new UserLogin(registerDto.email(), encryptedPassword, registerDto.role());
        newUser.setCreatedAt(new Date(System.currentTimeMillis()));
        this.userRepository.save(newUser);
        return ResponseEntity.ok().build();
    }

	public ResponseEntity isTokenValid(@RequestBody TokenDTO dto) {
		try {
			String isTokenValid = tokenService.validateToken(dto.getToken());
			
			boolean valid = (isTokenValid.equals("")) ? false : true;
			
			return new ResponseEntity(valid, HttpStatus.OK);
		}catch (Exception e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}


    
}