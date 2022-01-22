package padrao;

public abstract class Conta implements IConta {
	protected static final int AGENCIA_PADRAO = 1;
	private static  int SENQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SENQUENCIAL++;
		this.cliente = cliente;
	}
	
	@Override
	public void sacar(double valor) {
		saldo -= valor;
		
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
		
	}

	@Override
	public void tranferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}
	
	protected void imprimirInfoComuns() {
		System.out.println(String.format("TITULAR: %s", this.cliente.getNome()));
		System.out.println(String.format("AGENCIA: %d", this.agencia));
		System.out.println(String.format("CONTA: %d", this.numero));
		System.out.println(String.format("SALDO: %.2f", this.saldo));
	}
	


	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}


}
