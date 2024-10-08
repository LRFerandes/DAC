package br.edu.ifpb.dac.LauroDac.model.entity;

import java.util.Objects;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Session {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	
	private String horario;
	
	private String data;
	
	private String local;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	
	
	public Session(Integer id, String horário, String data, String local) {
		super();
		this.id = id;
		this.horario = horário;
		this.data = data;
		this.local = local;
	}
	public Session() {
		super();
	}
	@Override
	public int hashCode() {
		return Objects.hash(horario, data, id, local);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Session other = (Session) obj;
		return Objects.equals(horario, other.horario) && Objects.equals(data, other.data)
				&& Objects.equals(id, other.id) && Objects.equals(local, other.local);
	}
	@Override
	public String toString() {
		return "Sessao [id=" + id + ", Horario=" + horario + ", data=" + data + ", local=" + local + "]";
	}
	
	
	
	
	
	
	
}
