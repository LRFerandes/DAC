package br.edu.ifpb.dac.LauroDac.service;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import br.edu.ifpb.dac.LauroDac.model.Filme;
import br.edu.ifpb.dac.LauroDac.model.Sessao;
import br.edu.ifpb.dac.LauroDac.model.SessaoRepository;

@Service
public class SessaoService {
	
	@Autowired
	private SessaoRepository SessaoRepository;
	
	public void Create(Sessao sessao) {
		SessaoRepository.save(sessao);
	}
	
	public List<Sessao> Read() {
		return SessaoRepository.findAll();
	}
	
	public void Delete(Integer id) {
		SessaoRepository.deleteById(id);
	}
	
	public void UpdateFilme(Integer id, String horario) {
		Sessao sessao = SessaoRepository.findById(id).orElse(null);
		sessao.setHorario(horario);
		SessaoRepository.save(sessao);
	}
	
	public void UpdateData(Integer id, String data) {
		Sessao sessao = SessaoRepository.findById(id).orElse(null);
		sessao.setData(data);
		SessaoRepository.save(sessao);
	}
	
	public void UpdateLocal(Integer id, String Local) {
		Sessao sessao = SessaoRepository.findById(id).orElse(null);
		sessao.setLocal(Local);
		SessaoRepository.save(sessao);
	}
}
