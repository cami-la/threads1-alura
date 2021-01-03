package site.camila.cursoalura.threads1.classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TarefaBuscaTextual implements Runnable {

	private String nomeArquivo;
	private String nome;

	public TarefaBuscaTextual(String nomeArquivo, String nome) {
		this.nomeArquivo = nomeArquivo;
		this.nome = nome;
	}

	@Override
	public void run() {
		try {
			Scanner scanner = new Scanner(new File(this.nomeArquivo));
			int numeroLinha = 0;
			while (scanner.hasNextLine()) {
				numeroLinha++;
				String linha = scanner.nextLine();
				if (linha.toLowerCase().contains(this.nome.toLowerCase()))
					System.out.println(this.nomeArquivo + " - " + numeroLinha + " - " +linha);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
			// e.printStackTrace();
		}
	}

}
