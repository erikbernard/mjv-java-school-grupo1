public class Conta {

	double saldoConta;
	String nomeCliente;
	int numeroConta;

	void sacar(double valor) {
		this.saldoConta -= valor;
	}

	Double consultarSaldo() {
		return saldoConta;
	}

	void transferir(Conta transfere, Conta recebe, double valor) {
		if (transfere.saldoConta >= valor) {
			transfere.sacar(valor);
			recebe.saldoConta += valor;
		} else {
		}
	}

}