package br.edu.ifpb.dac.LauroDac.Controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.edu.ifpb.dac.LauroDac.model.Filme;
import br.edu.ifpb.dac.LauroDac.model.Sessao;
import br.edu.ifpb.dac.LauroDac.service.FilmeService;
import br.edu.ifpb.dac.LauroDac.service.SessaoService;

@Controller
public class SessaoController {
	
	@Autowired
	private SessaoService sessaoService;
	
	public void salvarSessao(Sessao sessao) {
		sessaoService.Create(sessao);
	}
	
	public List<Sessao> FilmeSessao() {
		return sessaoService.Read();
	}
	
	public void ExcluirSessao(Integer id) {
		sessaoService.Delete(id);
	}
	
	public void mudarFilmeEmCartaz(Integer id, String fime) {
		sessaoService.UpdateFilme(id, fime);
	}

}
