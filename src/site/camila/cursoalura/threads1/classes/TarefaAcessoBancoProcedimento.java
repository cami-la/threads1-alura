package site.camila.cursoalura.threads1.classes;

public class TarefaAcessoBancoProcedimento implements Runnable {

	private PoolDeConexao pool;
	private GerenciadorDeTransacao tx;

	public TarefaAcessoBancoProcedimento(PoolDeConexao pool, GerenciadorDeTransacao tx) {
		this.pool = pool;
		this.tx = tx;
	}

	@Override
	public void run() {
		synchronized (tx) {
			System.out.println("Começando a tx...");
			tx.begin();
			
			synchronized(pool) {
				System.out.println("Peguei a conexão");
				pool.getConnection();
			}
		}
	}

}
