package br.edu.ifpb.dac.LauroDac.bussines.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifpb.dac.LauroDac.bussines.service.AuthorizationService;
import br.edu.ifpb.dac.LauroDac.presentation.DTO.AuthetinticationDto;
import br.edu.ifpb.dac.LauroDac.presentation.DTO.RegisterDto;
import br.edu.ifpb.dac.LauroDac.presentation.DTO.TokenDTO;

@RestController
//@RequestMapping("auth")
public class AuthController {
   
    @Autowired
    AuthorizationService authorizationService;

    @PostMapping("/login")
    public ResponseEntity<Object> login(@RequestBody @Validated AuthetinticationDto authetinticationDto){
        return authorizationService.login(authetinticationDto);
    }


    @PostMapping("/register")
    public ResponseEntity<Object> register (@RequestBody RegisterDto registerDto){
        return authorizationService.register(registerDto);
    }
    
    @PostMapping("/isTokenValid")
	public ResponseEntity isTokenValid(@RequestBody TokenDTO dto) {
		return authorizationService.isTokenValid(dto);
	}
    
}