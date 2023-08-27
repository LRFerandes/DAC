package br.edu.ifpb.dac.LauroDac.presentation.DTO;

import java.util.Objects;

public class SessionDTO {
	
	private String horario;
	
	private String data;
	
	private String local;


	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		horario = horario;
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

	

	@Override
	public int hashCode() {
		return Objects.hash(horario, data, local);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SessionDTO other = (SessionDTO) obj;
		return Objects.equals(horario, other.horario) && Objects.equals(data, other.data)
				&& Objects.equals(local, other.local);
	}

	public SessionDTO() {
		super();
	}
	
	
}
