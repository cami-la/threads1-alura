package site.camila.cursoalura.threads1.classes;

public class ImprimeString implements Runnable {
	
	@Override
	public void run() {
		System.out.println("Imprimindo na thread");
	}

}
