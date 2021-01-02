package site.camila.cursoalura.threads1.executavel;

import site.camila.cursoalura.threads1.classes.ImprimeString;

public class RespostaMain {

	public static void main(String[] args) {
		/*Runnable tarefa = new ImprimeString();
		Thread thread = new Thread(tarefa);
		thread.start();*/
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("resposta");
			}
		}).start();	
	}
}
