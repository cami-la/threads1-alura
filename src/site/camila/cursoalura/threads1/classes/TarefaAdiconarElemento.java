package site.camila.cursoalura.threads1.classes;

import java.util.List;

public class TarefaAdiconarElemento implements Runnable {

	private Lista lista;
	private int numeroDoThread;

	public TarefaAdiconarElemento(Lista lista, int numeroDoThread) {
		this.lista = lista;
		this.numeroDoThread = numeroDoThread;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++)
			lista.adicionaElementos("Thread " + this.numeroDoThread + " - " + i);
//			lista.adicionaElementos("Thread " + this.numeroDoThread);
	}
}
