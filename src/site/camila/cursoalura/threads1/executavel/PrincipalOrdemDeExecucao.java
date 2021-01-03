package site.camila.cursoalura.threads1.executavel;

import site.camila.cursoalura.threads1.classes.TarefaImprimeNumeros;

public class PrincipalOrdemDeExecucao {

	public static void main(String[] args) {
		new Thread(new TarefaImprimeNumeros()).start();
		new Thread(new TarefaImprimeNumeros()).start();
	}

}
