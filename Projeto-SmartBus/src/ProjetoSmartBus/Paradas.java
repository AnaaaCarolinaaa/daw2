package ProjetoSmartBus;

import java.sql.Date;

public class Paradas {
	private int id_paradas;
	private String localiza��o;
	private Date horario_de_sa�da;
	private Date horario_de_chegada;
	public int getId_paradas() {
		return id_paradas;
	}
	public void setId_paradas(int id_paradas) {
		this.id_paradas = id_paradas;
	}
	public String getLocaliza��o() {
		return localiza��o;
	}
	public void setLocaliza��o(String localiza��o) {
		this.localiza��o = localiza��o;
	}
	public Date getHorario_de_sa�da() {
		return horario_de_sa�da;
	}
	public void setHorario_de_sa�da(Date horario_de_sa�da) {
		this.horario_de_sa�da = horario_de_sa�da;
	}
	public Date getHorario_de_chegada() {
		return horario_de_chegada;
	}
	public void setHorario_de_chegada(Date horario_de_chegada) {
		this.horario_de_chegada = horario_de_chegada;
	}
}
	