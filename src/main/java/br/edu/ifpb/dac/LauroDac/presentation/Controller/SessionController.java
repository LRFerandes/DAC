package br.edu.ifpb.dac.LauroDac.presentation.Controller;

import java.util.List;
import java.util.Set;

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
import br.edu.ifpb.dac.LauroDac.bussines.service.SessionService;
import br.edu.ifpb.dac.LauroDac.model.entity.Movie;
import br.edu.ifpb.dac.LauroDac.model.entity.Session;

@RestController
public class SessionController {
	
	@Autowired
	private SessionService sessaoService;
	
	
	@PostMapping("/Session")
	public void saveSession(@RequestBody Session sessao) {
		sessaoService.Create(sessao);
	}
	
	@GetMapping("/Session")
	public List<Session> ListSession() {
		return sessaoService.Read();
	}
	
	@DeleteMapping("/Session/{id}")
	public void DeleteSession(@PathVariable("id") Integer id) {
		sessaoService.Delete(id);
	}
	
	@PutMapping("/Session/{id}")
	public void changeMovieOnPoster(@PathVariable Integer id, @RequestBody String fime) {
		sessaoService.UpdateFilme(id, fime);
	}
	
	

}
