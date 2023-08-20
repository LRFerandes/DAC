package br.edu.ifpb.dac.LauroDac.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.edu.ifpb.dac.LauroDac.model.Filme;
import br.edu.ifpb.dac.LauroDac.model.FilmeRepository;
import br.edu.ifpb.dac.LauroDac.model.Sessao;
import br.edu.ifpb.dac.LauroDac.service.FilmeService;

@Controller
public class FilmeController {
	
	@Autowired
	private FilmeService filmeRepository;
	
	public void SalvarFilme(Filme filme) {
		filmeRepository.Create(filme);
	}
	
	public void MudarNomeDoFilme(Integer id, String Nome) {
		filmeRepository.UpdateNome(id, Nome);
	}
	
	public void ApagarFilme(Integer id) {
		filmeRepository.Delete(id);
	}
	
	public List<Filme> ListarFilmes(){
		return filmeRepository.Read();
	}
	
	public void AdicionarSessao(Integer id, Sessao sessao) {
		filmeRepository.AdicionarSessao(id, sessao);
	}
	
}
