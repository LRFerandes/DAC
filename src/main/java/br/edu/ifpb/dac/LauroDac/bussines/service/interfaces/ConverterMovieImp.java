package br.edu.ifpb.dac.LauroDac.bussines.service.interfaces;

import br.edu.ifpb.dac.LauroDac.model.entity.Movie;
import br.edu.ifpb.dac.LauroDac.presentation.DTO.MovieDTO;

public interface ConverterMovieImp {
	
	public MovieDTO ToMovieDTO(Movie movie);
	public Movie ToMovie(MovieDTO movieDTO);

}
