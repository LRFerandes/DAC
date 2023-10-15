package br.edu.ifpb.dac.LauroDac.bussines.service;

import java.util.Scanner;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import br.edu.ifpb.dac.LauroDac.bussines.service.interfaces.ConverterSessionInterface;
import br.edu.ifpb.dac.LauroDac.model.entity.Session;
import br.edu.ifpb.dac.LauroDac.presentation.DTO.SessionDTO;

@Service
public class ConverterSession implements ConverterSessionInterface {
	
	public SessionDTO toSessionDTO(Session session) {
		SessionDTO sdto = new SessionDTO();
		
		sdto.setData(session.getData());
		sdto.setHorario(session.getHorario());
		sdto.setLocal(session.getLocal());
		
		return sdto;
	}
	
	public Session toSession(SessionDTO sdto) {
		Session session = new Session();
		session.setData(sdto.getData());
		session.setHorario(sdto.getHorario());
		session.setLocal(sdto.getLocal());
		
		return session;
		
	}
}
