package br.edu.ifpb.dac.LauroDac.bussines.service.interfaces;

import java.util.List;

import br.edu.ifpb.dac.LauroDac.model.entity.Session;
import br.edu.ifpb.dac.LauroDac.presentation.DTO.MovieDTO;
import br.edu.ifpb.dac.LauroDac.presentation.DTO.SessionDTO;

public interface SessionImp {
	
	
	public  void Create(Session obj);
	public List<Session> Read();
	public void Delete(Integer id);
	public void Update(Integer id,  Session session);
}
