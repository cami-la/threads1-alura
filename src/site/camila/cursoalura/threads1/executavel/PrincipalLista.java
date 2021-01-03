package site.camila.cursoalura.threads1.executavel;

import java.util.List;
import java.util.Vector;

import site.camila.cursoalura.threads1.classes.TarefaAdiconarElemento;

public class PrincipalLista {

	public static void main(String[] args) {
		//List<String> lista = Collections.synchronizedList(new ArrayList<String>());
		List<String> lista = new Vector<String>();
		
		for (int i = 0; i < 10; i++) {
			new Thread(new TarefaAdiconarElemento(lista, i)).start();
		}

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < lista.size(); i++)
			System.out.println(i + " -" + lista.get(i));
	}

}
