public class Conta {

    double saldoConta;
    String nomeCliente;
	
    void sacar(double valor) {
        this.saldoConta -= valor;
    }

    Double consultarSaldo(){
	return saldoConta;
    }


}