package br.edu.ifpb.dac.LauroDac.bussines.service;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import br.edu.ifpb.dac.LauroDac.bussines.service.interfaces.SessionInt;
import br.edu.ifpb.dac.LauroDac.model.entity.Movie;
import br.edu.ifpb.dac.LauroDac.model.entity.Session;
import br.edu.ifpb.dac.LauroDac.model.repositories.SessionRepository;
import br.edu.ifpb.dac.LauroDac.presentation.DTO.SessionDTO;

@Service
public class SessionService implements SessionInt{
	
	@Autowired
	private SessionRepository sessionRepository;
	
	public void create(Session sessao) {
		sessionRepository.save(sessao);
	}
	
	public List<Session> read() {
		return sessionRepository.findAll();
	}
	
	public void delete(Integer id) {
		sessionRepository.deleteById(id);
	}
	
	public void update(Integer id, Session newSession) {
		Session sessao = sessionRepository.findById(id).orElse(null);
		sessao.setData(newSession.getData());
		sessao.setHorario(newSession.getHorario());
		sessao.setLocal(newSession.getLocal());
		sessionRepository.save(sessao);
	}
}
