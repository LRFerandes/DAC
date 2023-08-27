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

import br.edu.ifpb.dac.LauroDac.bussines.service.ConverterMovie;
import br.edu.ifpb.dac.LauroDac.bussines.service.MovieService;
import br.edu.ifpb.dac.LauroDac.bussines.service.interfaces.ConverterMovieImp;
import br.edu.ifpb.dac.LauroDac.bussines.service.interfaces.MovieImp;
import br.edu.ifpb.dac.LauroDac.model.entity.Movie;
import br.edu.ifpb.dac.LauroDac.model.entity.Session;
import br.edu.ifpb.dac.LauroDac.model.repositories.MovieRepository;
import br.edu.ifpb.dac.LauroDac.presentation.DTO.MovieDTO;

@RestController
public class MovieController {
	
	@Autowired
	private MovieImp MovieService;
	@Autowired
	private ConverterMovieImp createMovie;
	
	@PostMapping("/Movie")
	public void saveMovie(@RequestBody MovieDTO movieDTO) {
		
		Movie movie = createMovie.ToMovie(movieDTO);
		MovieService.Create(movie);
	}
	
	@PutMapping("/Movie/{id}")
	public void ChangeMovie(@PathVariable("id") Integer id, @RequestBody MovieDTO movieDTO) {
		MovieService.Update(id, movieDTO);
	}
	
	@DeleteMapping("/Movie/{id}")
	public void DeleteMovie(@PathVariable("id") Integer id) {
		MovieService.Delete(id);
	}
	
	@GetMapping("/Movie")
	public List<Movie> ListMovies(){
		return MovieService.Read();
	}
	
	
}
