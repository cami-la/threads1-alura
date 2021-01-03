package site.camila.cursoalura.threads1.executavel;

import site.camila.cursoalura.threads1.classes.TarefaBuscaTextual;

public class Principal {

	public static void main(String[] args) {
		String nome = "da";
		Thread threadAssinatura1 = new Thread(new TarefaBuscaTextual("assinaturas1.txt", nome));
		Thread threadAssinatura2 = new Thread(new TarefaBuscaTextual("assinaturas2.txt", nome));
		Thread threadAutores = new Thread(new TarefaBuscaTextual("autores.txt", nome));
		
		threadAssinatura1.start();
		threadAssinatura2.start();
		threadAutores.start();
	}

}
