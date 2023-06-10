public class Conta {

	double saldoConta;
	String nomeCliente;
	int numeroConta;
  boolean contaAtiva;
  String dataNascimento;
  float extrato;

	void sacar(double valor) {
		this.saldoConta -= valor;
	}

    boolean cancelarConta(){
        return this.contaAtiva = false;
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
  
   void consultarExtrato() {
      System.out.println (this.nomeCliente + ", o extrato da sua conta é de: " + this.extrato);
   }

}