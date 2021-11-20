package presencaAlunoMentorama;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	private String nome;
	
	private List<Presenca> presencas = new ArrayList<>();
	
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void adicionaPresenca(String data, Presente presente) {
		this.presencas.add(new Presenca(data, presente));
	}

	public void imprimePresencas() {
		for(Presenca presenca : presencas) {
			System.out.println(presenca);
		}
	}
	
}
