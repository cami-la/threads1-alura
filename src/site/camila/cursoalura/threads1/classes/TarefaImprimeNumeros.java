package site.camila.cursoalura.threads1.classes;

public class TarefaImprimeNumeros implements Runnable {

	@Override
	public void run() {
		int count = 0;
		while(count <= 1000) {
			Thread threadAtual = Thread.currentThread();
            System.out.println(threadAtual.getId() + " - " + count);
            count++;
        }
	}

}
