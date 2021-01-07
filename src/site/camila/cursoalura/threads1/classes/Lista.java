package site.camila.cursoalura.threads1.classes;

public class Lista {
	private String[] elementos = new String[1000];
	private int indice = 0;
	
	public synchronized void adicionaElementos(String elemento) {
			this.elementos[indice] = elemento;
			this.indice++;
			
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if (this.indice == this.elementos.length) {
				System.out.println("Lista está cheia, notificando...");
				this.notify();
			}
		}
	
	public int tamanho() {
		return this.elementos.length;
	}
	
	public String pegaElemento(int posicao) {
		return elementos[posicao];
	}
}
