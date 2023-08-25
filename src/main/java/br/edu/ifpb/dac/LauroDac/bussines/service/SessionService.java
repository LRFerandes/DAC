package br.edu.ifpb.dac.LauroDac.bussines.service;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import br.edu.ifpb.dac.LauroDac.model.entity.Movie;
import br.edu.ifpb.dac.LauroDac.model.entity.Session;
import br.edu.ifpb.dac.LauroDac.model.repositories.SessionRepository;

@Service
public class SessionService {
	
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
	
	public void UpdateFilme(Integer id, String horario) {
		Session sessao = SessionRepository.findById(id).orElse(null);
		sessao.setHorario(horario);
		SessionRepository.save(sessao);
	}
	
	public void UpdateData(Integer id, String data) {
		Session sessao = SessionRepository.findById(id).orElse(null);
		sessao.setData(data);
		SessionRepository.save(sessao);
	}
	
	public void UpdateLocal(Integer id, String Local) {
		Session sessao = SessionRepository.findById(id).orElse(null);
		sessao.setLocal(Local);
		SessionRepository.save(sessao);
	}
}
