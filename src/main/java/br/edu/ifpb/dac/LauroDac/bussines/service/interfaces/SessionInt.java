package br.edu.ifpb.dac.LauroDac.bussines.service.interfaces;

import java.util.List;

import br.edu.ifpb.dac.LauroDac.model.entity.Session;
import br.edu.ifpb.dac.LauroDac.presentation.DTO.MovieDTO;
import br.edu.ifpb.dac.LauroDac.presentation.DTO.SessionDTO;

public interface SessionInt {
	
	
	public  void create(Session obj);
	public List<Session> read();
	public void delete(Integer id);
	public void update(Integer id,  Session session);
}
