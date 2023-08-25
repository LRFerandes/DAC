package br.edu.ifpb.dac.LauroDac.bussines.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifpb.dac.LauroDac.model.entity.Movie;
import br.edu.ifpb.dac.LauroDac.model.entity.Session;
import br.edu.ifpb.dac.LauroDac.model.repositories.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository MovieRepository;
	
	public void Create(Movie filme) {
		MovieRepository.save(filme);
	}
	
	public List<Movie> Read() {
		return MovieRepository.findAll();
	}
	
	
	public void Delete(Integer id) {
		MovieRepository.deleteById(id);
	}
	
	public void UpdateNome(Integer id, String nome) {
		Movie filme = MovieRepository.findById(id).orElse(null);
		filme.setNome(nome);
		MovieRepository.save(filme);
	}
	
	public void UpdateData(Integer id, String Genero) {
		Movie filme = MovieRepository.findById(id).orElse(null);
		filme.setGenero(Genero);
		MovieRepository.save(filme);
	}
	
	public void UpdateSessao(Integer id, List<Session> Sessao) {
		Movie filme = MovieRepository.findById(id).orElse(null);
		filme.setSessao(Sessao);
		MovieRepository.save(filme);
	}
	
	public void AddSession(Integer id, Session sessao) {
		Movie filme = MovieRepository.findById(id).orElse(null);
		filme.getSessao().add(sessao);
		MovieRepository.save(filme);
	}
	
	
	
	
	

}
