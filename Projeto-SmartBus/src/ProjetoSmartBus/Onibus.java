package ProjetoSmartBus;

public class Onibus {
	private int Id_onibus;
	private int QntPassageiros;
	private String destino;
	private String horario;
	public int getId_onibus() {
		return Id_onibus;
	}
	public void setId_onibus(int id_onibus) {
		Id_onibus = id_onibus;
	}
	public int getQntPassageiros() {
		return QntPassageiros;
	}
	public void setQntPassageiros(int qntPassageiros) {
		QntPassageiros = qntPassageiros;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	

}
