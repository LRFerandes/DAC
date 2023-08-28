package br.edu.ifpb.dac.LauroDac.bussines.service;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import br.edu.ifpb.dac.LauroDac.bussines.service.interfaces.SessionImp;
import br.edu.ifpb.dac.LauroDac.model.entity.Movie;
import br.edu.ifpb.dac.LauroDac.model.entity.Session;
import br.edu.ifpb.dac.LauroDac.model.repositories.SessionRepository;
import br.edu.ifpb.dac.LauroDac.presentation.DTO.SessionDTO;

@Service
public class SessionService implements SessionImp{
	
	@Autowired
	private SessionRepository SessionRepository;
	
	public void Create(Session sessao) {
		SessionRepository.save(sessao);
	}
	
	public List<Session> Read() {
		return SessionRepository.findAll();
	}
	
	public void Delete(Integer id) {
		SessionRepository.deleteById(id);
	}
	
	public void Update(Integer id, Session newSession) {
		Session sessao = SessionRepository.findById(id).orElse(null);
		sessao.setData(newSession.getData());
		sessao.setHorario(newSession.getHorario());
		sessao.setLocal(newSession.getLocal());
		SessionRepository.save(sessao);
	}
}
