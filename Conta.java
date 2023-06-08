public class Conta {

    double saldoConta;
    String nomeCliente;
    String numeroConta;
	boolean contaAtiva;
    void sacar(double valor) {
        this.saldoConta -= valor;
    }

    Double consultarSaldo(){
	return saldoConta;
    }

    boolean cancelarConta(){
        return this.contaAtiva = false;
    }

}