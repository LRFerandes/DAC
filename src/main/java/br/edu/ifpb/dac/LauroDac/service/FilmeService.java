package br.edu.ifpb.dac.LauroDac.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifpb.dac.LauroDac.model.Filme;
import br.edu.ifpb.dac.LauroDac.model.FilmeRepository;
import br.edu.ifpb.dac.LauroDac.model.Sessao;

@Service
public class FilmeService {
	
	@Autowired
	private FilmeRepository filmeRepository;
	
	public void Create(Filme filme) {
		filmeRepository.save(filme);
	}
	
	public List<Filme> Read() {
		return filmeRepository.findAll();
	}
	
	
	public void Delete(Integer id) {
		filmeRepository.deleteById(id);
	}
	
	public void UpdateNome(Integer id, String nome) {
		Filme filme = filmeRepository.findById(id).orElse(null);
		filme.setNome(nome);
		filmeRepository.save(filme);
	}
	
	public void UpdateData(Integer id, String Genero) {
		Filme filme = filmeRepository.findById(id).orElse(null);
		filme.setGenero(Genero);
		filmeRepository.save(filme);
	}
	
	public void UpdateSessao(Integer id, List<Sessao> Sessao) {
		Filme filme = filmeRepository.findById(id).orElse(null);
		filme.setSessao(Sessao);
		filmeRepository.save(filme);
	}
	
	public void AdicionarSessao(Integer id, Sessao sessao) {
		Filme filme = filmeRepository.findById(id).orElse(null);
		filme.getSessao().add(sessao);
		filmeRepository.save(filme);
	}
	
	
	
	
	

}
