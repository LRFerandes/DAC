package br.edu.ifpb.dac.LauroDac.bussines.service;

import java.util.Scanner;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import br.edu.ifpb.dac.LauroDac.bussines.service.interfaces.ConverterMovieInterface;
import br.edu.ifpb.dac.LauroDac.model.entity.Movie;
import br.edu.ifpb.dac.LauroDac.model.entity.Session;
import br.edu.ifpb.dac.LauroDac.presentation.DTO.MovieDTO;

@Service
public class ConverterMovie implements ConverterMovieInterface {
	
	@Override
	public MovieDTO toMovieDTO(Movie movie) {
		
		MovieDTO mdto = new MovieDTO();
		mdto.setGenero(movie.getGenero());
		mdto.setNome(movie.getNome());
		
		return mdto;
		
	}
	
	@Override
	public Movie toMovie(MovieDTO movieDTO) {
		Movie m = new Movie();
		m.setGenero(movieDTO.getGenero());
		m.setNome(movieDTO.getNome());
		m.setSessao(movieDTO.getSessao());
		
		return m;
		
	}





	
}
