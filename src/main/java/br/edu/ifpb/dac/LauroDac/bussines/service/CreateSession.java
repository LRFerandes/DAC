package br.edu.ifpb.dac.LauroDac.bussines.service;

import java.util.Scanner;

import org.springframework.stereotype.Component;

import br.edu.ifpb.dac.LauroDac.model.entity.Session;

@Component
public class CreateSession {
	
	public Session CreateSession() {
		Scanner sc = new Scanner(System.in);
		Session s = new Session();
		System.out.println("Hora");
		s.setHorario(sc.nextLine());
		System.out.println("Data");
		s.setData(sc.nextLine());
		System.out.println("Local");
		s.setLocal(sc.nextLine());
		
		return s;
	}
}
