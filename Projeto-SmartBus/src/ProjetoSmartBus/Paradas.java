package ProjetoSmartBus;

import java.sql.Date;

public class Paradas {
	private int id_paradas;
	private String localização;
	private Date horario_de_saída;
	private Date horario_de_chegada;
	public int getId_paradas() {
		return id_paradas;
	}
	public void setId_paradas(int id_paradas) {
		this.id_paradas = id_paradas;
	}
	public String getLocalização() {
		return localização;
	}
	public void setLocalização(String localização) {
		this.localização = localização;
	}
	public Date getHorario_de_saída() {
		return horario_de_saída;
	}
	public void setHorario_de_saída(Date horario_de_saída) {
		this.horario_de_saída = horario_de_saída;
	}
	public Date getHorario_de_chegada() {
		return horario_de_chegada;
	}
	public void setHorario_de_chegada(Date horario_de_chegada) {
		this.horario_de_chegada = horario_de_chegada;
	}
}
	