package br.edu.ifpb.dac.LauroDac;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.ifpb.dac.LauroDac.Controller.FilmeController;
import br.edu.ifpb.dac.LauroDac.Controller.SessaoController;
import br.edu.ifpb.dac.LauroDac.model.Filme;
import br.edu.ifpb.dac.LauroDac.model.Sessao;
import br.edu.ifpb.dac.LauroDac.util.CreateFilme;
import br.edu.ifpb.dac.LauroDac.util.CreateSessao;


@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	
	@Autowired
	private FilmeController filmeController;
	@Autowired
	private SessaoController sessaoControler;
	@Autowired
	private CreateFilme criarFilme;
	@Autowired
	private CreateSessao criarSessao;
	
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
			
			Filme a = criarFilme.criarFilme();	
			filmeController.SalvarFilme(a);
			
			}else if (opcao.equalsIgnoreCase("2")) {

				Sessao s = criarSessao.criarSessao();
				sessaoControler.salvarSessao(s);
				
			
			}
			else if(opcao.equalsIgnoreCase("3")) {
				
				Filme a = criarFilme.criarFilme();
				Sessao s = criarSessao.criarSessao();
				a.getSessao().add(s);
				
				sessaoControler.salvarSessao(s);
				filmeController.SalvarFilme(a);
				
			}
			else if(opcao.equalsIgnoreCase("4")) {
				System.out.println("------------FILMES -----------");
				for (Filme Filme : filmeController.ListarFilmes()) {
					System.out.println(Filme.toString());
				}
				System.out.println("------------Sessões -----------");
				for (Sessao Sessao : sessaoControler.FilmeSessao()) {
					System.out.println(Sessao.toString());
				}
			}
			else if(opcao.equalsIgnoreCase("5")) {
				break;
			}
		}

	}

}
