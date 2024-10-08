package br.edu.ifpb.dac.LauroDac.presentation.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
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
import br.edu.ifpb.dac.LauroDac.bussines.service.interfaces.ConverterMovieInterface;
import br.edu.ifpb.dac.LauroDac.bussines.service.interfaces.MovieInt;
import br.edu.ifpb.dac.LauroDac.model.entity.Movie;
import br.edu.ifpb.dac.LauroDac.model.entity.Session;
import br.edu.ifpb.dac.LauroDac.model.repositories.MovieRepository;
import br.edu.ifpb.dac.LauroDac.presentation.DTO.MovieDTO;
import jakarta.annotation.security.RolesAllowed;

@RestController
public class MovieController {
	
	@Autowired
	private MovieInt movieService;
	@Autowired
	private ConverterMovieInterface createMovie;
	
	@PostMapping("/Movie")
	public void saveMovie(@RequestBody MovieDTO movieDTO) {
		
		Movie movie = createMovie.toMovie(movieDTO);
		movieService.create(movie);
	}
	
	@PutMapping("/Movie/{id}")
	public void changeMovie(@PathVariable("id") Integer id, @RequestBody MovieDTO movieDTO) {
		movieService.update(id, movieDTO);
	}
	
	@DeleteMapping("/Movie/{id}")
	public void deleteMovie(@PathVariable("id") Integer id) {
		movieService.delete(id);
	}
	
	@GetMapping("/Movie")
	public List<Movie> listMovies(){
		return movieService.read();
	}
	
	
}
