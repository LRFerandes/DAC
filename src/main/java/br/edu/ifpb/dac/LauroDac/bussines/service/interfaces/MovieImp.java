package br.edu.ifpb.dac.LauroDac.bussines.service.interfaces;

import java.util.List;

import br.edu.ifpb.dac.LauroDac.model.entity.Movie;
import br.edu.ifpb.dac.LauroDac.presentation.DTO.MovieDTO;


public interface MovieImp {
	
	public  void Create(Movie obj);
	public List<Movie> Read();
	public void Delete(Integer id);
	public void Update(Integer id,  MovieDTO obj);
	
}
