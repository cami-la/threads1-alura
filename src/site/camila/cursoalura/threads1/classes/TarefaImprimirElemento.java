package site.camila.cursoalura.threads1.classes;

public class TarefaImprimirElemnto implements Runnable {

	private Lista lista;
	// private int numeroDoThread;

	public TarefaImprimirElemnto(Lista lista) {
		this.lista = lista;
		// this.numeroDoThread = numeroDoThread;
	}

	@Override
	public void run() {

//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}

		synchronized (lista) {
			if (!lista.estaCheia()) {
				try {
					System.out.println("Esperando, aguardando a notificação...");
					lista.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}

			for (int i = 0; i < lista.tamanho(); i++) {
//				System.out.println(i + " - " +lista.pegaElemento(i));
				System.out.println(i + " - " + lista.pegaElemento(i));

			}
		}

	}

}
