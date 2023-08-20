package br.edu.ifpb.dac.LauroDac.util;

import java.util.Scanner;

import org.springframework.stereotype.Component;

import br.edu.ifpb.dac.LauroDac.model.Sessao;

@Component
public class CreateSessao {
	
	public Sessao criarSessao() {
		Scanner sc = new Scanner(System.in);
		Sessao s = new Sessao();
		System.out.println("Hora");
		s.setHorario(sc.nextLine());
		System.out.println("Data");
		s.setData(sc.nextLine());
		System.out.println("Local");
		s.setLocal(sc.nextLine());
		
		return s;
	}
}
