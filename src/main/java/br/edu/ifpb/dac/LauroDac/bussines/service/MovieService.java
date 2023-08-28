package br.edu.ifpb.dac.LauroDac.bussines.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifpb.dac.LauroDac.bussines.service.interfaces.MovieImp;
import br.edu.ifpb.dac.LauroDac.model.entity.Movie;
import br.edu.ifpb.dac.LauroDac.model.entity.Session;
import br.edu.ifpb.dac.LauroDac.model.repositories.MovieRepository;
import br.edu.ifpb.dac.LauroDac.presentation.DTO.MovieDTO;

@Service
public class MovieService implements MovieImp {
	
	@Autowired
	private MovieRepository MovieRepository;
	
	@Override
	public void Create(Movie filme) {
		
		MovieRepository.save(filme);
	}
	
	public List<Movie> Read() {
		return MovieRepository.findAll();
	}
	
	
	public void Delete(Integer id) {
		MovieRepository.deleteById(id);
	}
	
	public void Update(Integer id, MovieDTO movie) {
		Movie filme = MovieRepository.findById(id).orElse(null);
		filme.setNome(movie.getNome());
		filme.setGenero(movie.getGenero());
		filme.setSessao(movie.getSessao());
		MovieRepository.save(filme);
	}



	

}
