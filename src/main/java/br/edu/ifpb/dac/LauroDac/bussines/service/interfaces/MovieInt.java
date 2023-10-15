package br.edu.ifpb.dac.LauroDac.bussines.service.interfaces;

import java.util.List;

import br.edu.ifpb.dac.LauroDac.model.entity.Movie;
import br.edu.ifpb.dac.LauroDac.presentation.DTO.MovieDTO;


public interface MovieInt {
	
	public  void create(Movie obj);
	public List<Movie> read();
	public void delete(Integer id);
	public void update(Integer id,  MovieDTO obj);
	
}
