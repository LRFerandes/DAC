package br.edu.ifpb.dac.LauroDac.presentation.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.edu.ifpb.dac.LauroDac.bussines.service.MovieService;
import br.edu.ifpb.dac.LauroDac.model.entity.Movie;
import br.edu.ifpb.dac.LauroDac.model.entity.Session;
import br.edu.ifpb.dac.LauroDac.model.repositories.MovieRepository;

@Controller
public class MovieController {
	
	@Autowired
	private MovieService filmeService;
	
	public void saveMovie(Movie filme) {
		filmeService.Create(filme);
	}
	
	public void ChangeMovieName(Integer id, String Nome) {
		filmeService.UpdateNome(id, Nome);
	}
	
	public void DeleteMovie(Integer id) {
		filmeService.Delete(id);
	}
	
	public List<Movie> ListMovies(){
		return filmeService.Read();
	}
	
	public void AddSession(Integer id, Session sessao) {
		filmeService.AddSession(id, sessao);
	}
	
}
