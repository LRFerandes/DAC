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

import br.edu.ifpb.dac.LauroDac.bussines.service.ConverterSession;
import br.edu.ifpb.dac.LauroDac.bussines.service.MovieService;
import br.edu.ifpb.dac.LauroDac.bussines.service.SessionService;
import br.edu.ifpb.dac.LauroDac.bussines.service.interfaces.ConverterSessionImp;
import br.edu.ifpb.dac.LauroDac.bussines.service.interfaces.SessionImp;
import br.edu.ifpb.dac.LauroDac.model.entity.Movie;
import br.edu.ifpb.dac.LauroDac.model.entity.Session;
import br.edu.ifpb.dac.LauroDac.presentation.DTO.SessionDTO;

@RestController
public class SessionController {
	
	@Autowired
	private SessionImp sessaoService;
	@Autowired
	private ConverterSessionImp createSession;
	
	
	@PostMapping("/Session")
	public void saveSession(@RequestBody SessionDTO SessionDTO) {
		
		Session session = createSession.toSession(SessionDTO);	
		sessaoService.Create(session);
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
	public void changeSession(@PathVariable("id") Integer id, @RequestBody SessionDTO sessionDTO) {
		Session session = createSession.toSession(sessionDTO);
		sessaoService.Update(id, session);
	}
	
	
	

}
