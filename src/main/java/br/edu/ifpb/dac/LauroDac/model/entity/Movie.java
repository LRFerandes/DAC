package br.edu.ifpb.dac.LauroDac.model.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	
	private String nome;
	
	private String Genero ;
	
	 @OneToMany
	private List<Session> sessao;
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
		Genero = genero;
	}
	public List<Session> getSessao() {
		return sessao;
	}
	public void setSessao(List<Session> sessao) {
		this.sessao = sessao;
	}
	public Movie(Integer id, String nome, String genero, List<Session> sessao) {
		super();
		this.id = id;
		this.nome = nome;
		this.Genero = genero;
		this.sessao = sessao;
	}
	public Movie() {
		super();
		this.sessao = new ArrayList<Session>();
	}
	@Override
	public int hashCode() {
		return Objects.hash(Genero, id, nome, sessao);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		return Objects.equals(Genero, other.Genero) && Objects.equals(id, other.id) && Objects.equals(nome, other.nome)
				&& Objects.equals(sessao, other.sessao);
	}
	@Override
	public String toString() {
		return "Filme [id=" + id + ", nome=" + nome + ", Genero=" + Genero + "]";
	}
	
	
	
	
	
	
}
