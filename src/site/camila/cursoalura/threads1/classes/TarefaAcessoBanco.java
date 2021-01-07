package site.camila.cursoalura.threads1.classes;

public class TarefaAcessoBanco implements Runnable {

	private PoolDeConexao pool;
	private GerenciadorDeTransacao tx;

	public TarefaAcessoBanco(PoolDeConexao pool, GerenciadorDeTransacao tx) {
		this.pool = pool;
		this.tx = tx;
	}

	@Override
	public void run() {
		synchronized (this.tx) {
			System.out.println("Começando a gerenciar a tx");
			tx.begin();
			synchronized (this.pool) {
				System.out.println("Peguei a chave do pool");
				pool.getConnection();

			}
		}
	}

}
