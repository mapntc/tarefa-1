
public class ContaEspecial extends Conta {
	
	private Double limite;

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}

	@Override
	public Conta abrirConta() {
		return new ContaEspecial();
	}

	@Override
	protected boolean temSaldo() {
		return super.temSaldo();
	}
}
