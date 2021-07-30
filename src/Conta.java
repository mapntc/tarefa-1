
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
		// Lógica para abrir conta
		return new Conta();
	}
	
	public void sacar(Double valor) {
		// Lógica para sacar dinheiro
	}
	
	private void debitar(Double valor) {
		// Lógica para debitar dinheiro
	}
	
	protected boolean temSaldo() {
		// Lógica para verificar se tem saldo
		if (saldo > 0.0) {
			return true;
		}
		return false;
	}
	
	public void depositar(Double valor) {
		// Lógica para depositar dinheiro
	}
	
	public void transferir(Double valor, Conta contaDestino) {
		// Lógica para transferir dinheiro
	}
}
