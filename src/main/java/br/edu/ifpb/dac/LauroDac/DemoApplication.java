package br.edu.ifpb.dac.LauroDac;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.ifpb.dac.LauroDac.bussines.service.CreateMovie;
import br.edu.ifpb.dac.LauroDac.bussines.service.CreateSession;
import br.edu.ifpb.dac.LauroDac.model.entity.Movie;
import br.edu.ifpb.dac.LauroDac.model.entity.Session;
import br.edu.ifpb.dac.LauroDac.presentation.Controller.MovieController;
import br.edu.ifpb.dac.LauroDac.presentation.Controller.SessionController;


@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	
	@Autowired
	private MovieController filmeController;
	@Autowired
	private SessionController sessaoControler;
	@Autowired
	private CreateMovie criarFilme;
	@Autowired
	private CreateSession criarSessao;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("----Menu------");
			System.out.println("1- Criar filme\n"
					+ "2- Criar sessão\n"
					+ "3- Criar Sessão para filme\n"
					+ "4 - Listar Entidades\n"
					+ "5 - sair");
			String opcao = sc.nextLine();
			
			if(opcao.equalsIgnoreCase("1")) {	
			
			Movie a = criarFilme.createMovie();	
			filmeController.saveMovie(a);
			
			}else if (opcao.equalsIgnoreCase("2")) {

				Session s = criarSessao.CreateSession();
				sessaoControler.saveSession(s);
				
			
			}
			else if(opcao.equalsIgnoreCase("3")) {
				
				Movie a = criarFilme.createMovie();
				Session s = criarSessao.CreateSession();
				a.getSessao().add(s);
				
				sessaoControler.saveSession(s);
				filmeController.saveMovie(a);
				
			}
			else if(opcao.equalsIgnoreCase("4")) {
				System.out.println("------------FILMES -----------");
				for (Movie Filme : filmeController.ListMovies()) {
					System.out.println(Filme.toString());
				}
				System.out.println("------------Sessões -----------");
				for (Session Sessao : sessaoControler.ListSession()) {
					System.out.println(Sessao.toString());
				}
			}
			else if(opcao.equalsIgnoreCase("5")) {
				break;
			}
		}

	}

}
