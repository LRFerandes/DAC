package br.edu.ifpb.dac.LauroDac.bussines.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifpb.dac.LauroDac.bussines.service.interfaces.MovieInt;
import br.edu.ifpb.dac.LauroDac.model.entity.Movie;
import br.edu.ifpb.dac.LauroDac.model.entity.Session;
import br.edu.ifpb.dac.LauroDac.model.repositories.MovieRepository;
import br.edu.ifpb.dac.LauroDac.presentation.DTO.MovieDTO;

@Service
public class MovieService implements MovieInt {
	
	@Autowired
	private MovieRepository movieRepository;
	
	@Override
	public void create(Movie filme) {
		
		movieRepository.save(filme);
	}
	
	public List<Movie> read() {
		return movieRepository.findAll();
	}
	
	
	public void delete(Integer id) {
		movieRepository.deleteById(id);
	}
	
	public void update(Integer id, MovieDTO movie) {
		Movie filme = movieRepository.findById(id).orElse(null);
		filme.setNome(movie.getNome());
		filme.setGenero(movie.getGenero());
		filme.setSessao(movie.getSessao());
		movieRepository.save(filme);
	}



	

}
