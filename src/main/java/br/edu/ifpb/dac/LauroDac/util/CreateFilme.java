package br.edu.ifpb.dac.LauroDac.util;

import java.util.Scanner;

import org.springframework.stereotype.Component;

import br.edu.ifpb.dac.LauroDac.model.Filme;
import br.edu.ifpb.dac.LauroDac.model.Sessao;

@Component
public class CreateFilme {
	
	public Filme criarFilme() {
		Scanner sc = new Scanner(System.in);
		Filme a = new Filme();
		System.out.println("nome Do filme");
		a.setNome(sc.nextLine());
		System.out.println("Genero");
		a.setGenero(sc.nextLine());
		
		return a;
	}
	
	public Filme criarFilme(Sessao sessao) {
		Scanner sc = new Scanner(System.in);
		Filme a = new Filme();
		System.out.println("nome Do filme");
		a.setNome(sc.nextLine());
		System.out.println("Genero");
		a.setGenero(sc.nextLine());
		a.getSessao().add(sessao);
		
		return a;
	}
}
