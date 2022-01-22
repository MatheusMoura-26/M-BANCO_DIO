package padrao;

public class Main {

	public static void main(String[] args) {
		Cliente Matheus = new Cliente();
		Matheus.setNome("Matheus");
		
		Conta cc = new ContaCorrente(Matheus);
		Conta cp = new ContaPoupanca(Matheus);
		
		cc.depositar(100);
		
		cc.tranferir(75, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		

	}

}
