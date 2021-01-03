package site.camila.cursoalura.threads1.executavel;

import site.camila.cursoalura.threads1.classes.Banheiro;
import site.camila.cursoalura.threads1.classes.TarefaNumero1;
import site.camila.cursoalura.threads1.classes.TarefaNumero2;

public class PrincipalBanheiro {

	public static void main(String[] args) {
		//2 threads acessando o mesmo objeto
		
        Banheiro banheiro = new Banheiro();

        //Passando a tarefa e o nome do Thread
        Thread convidado1 = new Thread(new TarefaNumero1(banheiro), "João");
        Thread convidado2 = new Thread(new TarefaNumero2(banheiro), "Pedro");
//        Thread convidado3 = new Thread(new TarefaNumero1(banheiro), "Maria");
//        Thread convidado4 = new Thread(new TarefaNumero2(banheiro), "Ana");

        convidado1.start();
        convidado2.start();
//        convidado3.start();
//        convidado4.start();


    }
}
