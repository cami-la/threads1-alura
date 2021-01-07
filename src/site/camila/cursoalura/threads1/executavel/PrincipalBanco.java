package site.camila.cursoalura.threads1.executavel;

import site.camila.cursoalura.threads1.classes.GerenciadorDeTransacao;
import site.camila.cursoalura.threads1.classes.PoolDeConexao;
import site.camila.cursoalura.threads1.classes.TarefaAcessoBanco;
import site.camila.cursoalura.threads1.classes.TarefaAcessoBancoProcedimento;

public class PrincipalBanco {

    public static void main(String[] args) {

        GerenciadorDeTransacao tx = new GerenciadorDeTransacao();
        PoolDeConexao pool = new PoolDeConexao();
        
        new Thread(new TarefaAcessoBanco(pool, tx)).start();
        new Thread(new TarefaAcessoBancoProcedimento(pool, tx)).start();

    }
}
