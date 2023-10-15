package br.edu.ifpb.dac.LauroDac;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import br.edu.ifpb.dac.LauroDac.model.entity.UserModel;
import br.edu.ifpb.dac.LauroDac.model.enums.UserRole;
import br.edu.ifpb.dac.LauroDac.model.repositories.UserRepository;






@SpringBootApplication
@EnableWebMvc
public class DemoApplication implements WebMvcConfigurer {
	
	@Autowired
	private UserRepository userRepository;
	
	
//	@Autowired
//	private MovieController filmeController;
//	@Autowired
//	private SessionController sessaoControler;
//	@Autowired
//	private ConverterMovie criarFilme;
//	@Autowired
//	private ConverterSession criarSessao;
	
	public static void main(String[] args) {
		UserModel user = new UserModel("Lauro", "123", UserRole.ADMIN);
		System.out.println(user.getId());
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
//		token.gerarToken(user);
		System.out.println(encoder.encode(user.getPassword()));
		SpringApplication.run(DemoApplication.class, args);
		
	}
	
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedMethods("GET", "POST", "PUT", "DELETE");
	}
	
			
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//			System.out.println("----Menu------");
//			System.out.println("1- Criar filme\n"
//					+ "2- Criar sessão\n"
//					+ "3- Criar Sessão para filme\n"
//					+ "4 - Listar Entidades\n"
//					+ "5 - sair");
//			String opcao = sc.nextLine();
//			
//			if(opcao.equalsIgnoreCase("1")) {	
//			
//			Movie a = criarFilme.createMovie();	
//			filmeController.saveMovie(a);
//			
//			}else if (opcao.equalsIgnoreCase("2")) {
//
//				Session s = criarSessao.CreateSession();
//				sessaoControler.saveSession(s);
//				
//			
//			}
//			else if(opcao.equalsIgnoreCase("3")) {
//				
//				Movie a = criarFilme.createMovie();
//				Session s = criarSessao.CreateSession();
//				a.getSessao().add(s);
//				
//				sessaoControler.saveSession(s);
//				filmeController.saveMovie(a);
//				
//			}
//			else if(opcao.equalsIgnoreCase("4")) {
//				System.out.println("------------FILMES -----------");
//				for (Movie Filme : filmeController.ListMovies()) {
//					System.out.println(Filme.toString());
//				}
//				System.out.println("------------Sessões -----------");
//				for (Session Sessao : sessaoControler.ListSession()) {
//					System.out.println(Sessao.toString());
//				}
//			}
//			else if(opcao.equalsIgnoreCase("5")) {
//				break;
//			}
//		}
//


}
