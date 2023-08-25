package br.edu.ifpb.dac.LauroDac.bussines.service;

import java.util.Scanner;

import org.springframework.stereotype.Component;

import br.edu.ifpb.dac.LauroDac.model.entity.Movie;
import br.edu.ifpb.dac.LauroDac.model.entity.Session;

@Component
public class CreateMovie {
	
	public Movie createMovie() {
		Scanner sc = new Scanner(System.in);
		Movie a = new Movie();
		System.out.println("nome Do filme");
		a.setNome(sc.nextLine());
		System.out.println("Genero");
		a.setGenero(sc.nextLine());
		
		return a;
	}
	
	public Movie createMovie(Session sessao) {
		Scanner sc = new Scanner(System.in);
		Movie a = new Movie();
		System.out.println("nome Do filme");
		a.setNome(sc.nextLine());
		System.out.println("Genero");
		a.setGenero(sc.nextLine());
		a.getSessao().add(sessao);
		
		return a;
	}
}
