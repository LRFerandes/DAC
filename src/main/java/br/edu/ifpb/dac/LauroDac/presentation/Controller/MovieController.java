package br.edu.ifpb.dac.LauroDac.presentation.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifpb.dac.LauroDac.bussines.service.MovieService;
import br.edu.ifpb.dac.LauroDac.model.entity.Movie;
import br.edu.ifpb.dac.LauroDac.model.entity.Session;
import br.edu.ifpb.dac.LauroDac.model.repositories.MovieRepository;

@RestController
public class MovieController {
	
	@Autowired
	private MovieService filmeService;
	
	@PostMapping("/Movie")
	public void saveMovie(@RequestBody Movie filme) {
		filmeService.Create(filme);
	}
	
	@PutMapping("/Movie/{id}")
	public void ChangeMovieName(@PathVariable Integer id, @RequestBody String Nome) {
		filmeService.UpdateNome(id, Nome);
	}
	
	@DeleteMapping("/Movie/{id}")
	public void DeleteMovie(@PathVariable("id") Integer id) {
		filmeService.Delete(id);
	}
	
	@GetMapping("/Movie")
	public List<Movie> ListMovies(){
		return filmeService.Read();
	}
	
	@PutMapping("/Movie/{id}")
	public void AddSession(@PathVariable Integer id, @RequestBody Session sessao) {
		filmeService.AddSession(id, sessao);
	}
	
}
