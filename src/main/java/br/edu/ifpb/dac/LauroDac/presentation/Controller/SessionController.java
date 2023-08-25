package br.edu.ifpb.dac.LauroDac.presentation.Controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.edu.ifpb.dac.LauroDac.bussines.service.MovieService;
import br.edu.ifpb.dac.LauroDac.bussines.service.SessionService;
import br.edu.ifpb.dac.LauroDac.model.entity.Movie;
import br.edu.ifpb.dac.LauroDac.model.entity.Session;

@Controller
public class SessionController {
	
	@Autowired
	private SessionService sessaoService;
	
	public void saveSession(Session sessao) {
		sessaoService.Create(sessao);
	}
	
	public List<Session> ListSession() {
		return sessaoService.Read();
	}
	
	public void DeleteSession(Integer id) {
		sessaoService.Delete(id);
	}
	
	public void changeMovieOnPoster(Integer id, String fime) {
		sessaoService.UpdateFilme(id, fime);
	}

}
