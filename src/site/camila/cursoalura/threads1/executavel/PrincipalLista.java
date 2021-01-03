package site.camila.cursoalura.threads1.executavel;

import site.camila.cursoalura.threads1.classes.Lista;
import site.camila.cursoalura.threads1.classes.TarefaAdiconarElemento;

public class PrincipalLista {

	public static void main(String[] args) {
		Lista lista = new Lista();

		for (int i = 0; i < 10; i++) {
			new Thread(new TarefaAdiconarElemento(lista, i)).start();
		}

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < lista.tamanho(); i++)
			System.out.println(i + " -" + lista.pegaElemento(i));
	}

}
