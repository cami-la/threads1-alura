package site.camila.cursoalura.threads1.executavel;

import site.camila.cursoalura.threads1.classes.Lista;
import site.camila.cursoalura.threads1.classes.TarefaAdiconarElemento;
import site.camila.cursoalura.threads1.classes.TarefaImprimirElemnto;

public class PrincipalLista {

	public static void main(String[] args) {
		//List<String> lista = Collections.synchronizedList(new ArrayList<String>());
		Lista lista = new Lista();
		
		for (int i = 0; i < 10; i++) {
			new Thread(new TarefaAdiconarElemento(lista, i)).start();
		}
		
		new Thread(new TarefaImprimirElemnto(lista)).start();
		
		
		
	}
}
