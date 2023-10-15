package br.edu.ifpb.dac.LauroDac.bussines.service.interfaces;

import br.edu.ifpb.dac.LauroDac.model.entity.Session;
import br.edu.ifpb.dac.LauroDac.presentation.DTO.SessionDTO;

public interface ConverterSessionInterface {
	
	
	public SessionDTO toSessionDTO(Session session);
	public Session toSession(SessionDTO sdto);
}
