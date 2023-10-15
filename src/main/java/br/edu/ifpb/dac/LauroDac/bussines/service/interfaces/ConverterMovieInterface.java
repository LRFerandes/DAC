package br.edu.ifpb.dac.LauroDac.bussines.service.interfaces;

import br.edu.ifpb.dac.LauroDac.model.entity.Movie;
import br.edu.ifpb.dac.LauroDac.presentation.DTO.MovieDTO;

public interface ConverterMovieInterface {
	
	public MovieDTO toMovieDTO(Movie movie);
	public Movie toMovie(MovieDTO movieDTO);

}
