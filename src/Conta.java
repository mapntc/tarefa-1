
public class Conta {

	private Pessoa cliente;
	private Integer nrConta;
	private Double saldo;
	
	public Pessoa getCliente() {
		return cliente;
	}
	
	public void setCliente(Pessoa cliente) {
		this.cliente = cliente;
	}
	
	public Integer getNrConta() {
		return nrConta;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	
	public Conta abrirConta() {
		// L�gica para abrir conta
		return new Conta();
	}
	
	public void sacar(Double valor) {
		// L�gica para sacar dinheiro
	}
	
	private void debitar(Double valor) {
		// L�gica para debitar dinheiro
	}
	
	protected boolean temSaldo() {
		// L�gica para verificar se tem saldo
		if (saldo > 0.0) {
			return true;
		}
		return false;
	}
	
	public void depositar(Double valor) {
		// L�gica para depositar dinheiro
	}
	
	public void transferir(Double valor, Conta contaDestino) {
		// L�gica para transferir dinheiro
	}
}
