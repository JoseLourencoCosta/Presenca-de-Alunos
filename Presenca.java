package presencaAlunoMentorama;

public class Presenca {
	
	private String data;
	
	private Presente presente;
	
	public Presenca(String data, Presente presente) {
		this.data = data;
		this.presente = presente;
	}
	
	public String getData() {
		return data;
	}
	
	public Presente getPresente() {
		return presente;
	}
	
	@Override
	public String toString() {
		return this.data + " - " + this.presente;
	}
}
