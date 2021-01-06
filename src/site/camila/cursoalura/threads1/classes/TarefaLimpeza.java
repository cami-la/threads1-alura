package site.camila.cursoalura.threads1.classes;

public class TarefaLimpeza implements Runnable {

    private Banheiro banheiro;

    public TarefaLimpeza(Banheiro banheiro) {
        this.banheiro = banheiro;
    }

    @Override
    public void run() {
        while(true) {
   	    	this.banheiro.limpa();
   	    	banheiro.dormeUmPouco(20000);

        }
    }
}
