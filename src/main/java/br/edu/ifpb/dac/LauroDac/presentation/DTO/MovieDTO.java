package br.edu.ifpb.dac.LauroDac.presentation.DTO;



import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import br.edu.ifpb.dac.LauroDac.model.entity.Session;

public class MovieDTO{
	
	
	private String nome;
	
	private String Genero;
	
	private List<Session> sessao;

	
	public List<Session> getSessao() {
		return sessao;
	}

	public void setSessao(List<Session> sessao) {
		this.sessao = sessao;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		this.Genero = genero;
	}



	@Override
	public int hashCode() {
		return Objects.hash(Genero, nome, sessao);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MovieDTO other = (MovieDTO) obj;
		return Objects.equals(Genero, other.Genero) && Objects.equals(nome, other.nome)
				&& Objects.equals(sessao, other.sessao);
	}

	public MovieDTO() {
		super();
		this.sessao = new ArrayList<>();
	}
	
	
	
	
}
