package br.edu.ifpb.dac.LauroDac.bussines.service;

import java.util.Scanner;

import org.springframework.stereotype.Component;

import br.edu.ifpb.dac.LauroDac.bussines.service.interfaces.ConverterMovieImp;
import br.edu.ifpb.dac.LauroDac.model.entity.Movie;
import br.edu.ifpb.dac.LauroDac.model.entity.Session;
import br.edu.ifpb.dac.LauroDac.presentation.DTO.MovieDTO;

@Component
public class ConverterMovie implements ConverterMovieImp {
	
	@Override
	public MovieDTO ToMovieDTO(Movie movie) {
		
		MovieDTO mdto = new MovieDTO();
		mdto.setGenero(movie.getGenero());
		mdto.setNome(movie.getNome());
		
		return mdto;
		
	}
	
	@Override
	public Movie ToMovie(MovieDTO movieDTO) {
		Movie m = new Movie();
		m.setGenero(movieDTO.getGenero());
		m.setNome(movieDTO.getNome());
		m.setSessao(movieDTO.getSessao());
		
		return m;
		
	}





	
}
