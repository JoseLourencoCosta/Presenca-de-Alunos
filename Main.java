package presencaAlunoMentorama;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Aluno jose = new Aluno("José");
		jose.adicionaPresenca("25/10/2021", Presente.AUSENTE);
		jose.adicionaPresenca("26/10/2021", Presente.PRESENTE);

		Aluno joao = new Aluno("João");
		joao.adicionaPresenca("25/10/2021", Presente.PRESENTE);
		joao.adicionaPresenca("26/10/2021", Presente.PRESENTE);

		List<Aluno> diarioDeClasse = new ArrayList<>();
		diarioDeClasse.add(jose);
		diarioDeClasse.add(joao);
		
		for(Aluno aluno: diarioDeClasse) {
			System.out.println("Aluno: " + aluno.getNome());
			aluno.imprimePresencas();
		}
	}

}
