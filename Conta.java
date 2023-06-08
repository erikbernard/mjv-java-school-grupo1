public class Conta {

    double saldoConta;
	String name;
	
    void sacar(double valor) {
        this.saldoConta -= valor;
    }

	Double consultarSaldo(){
		return saldoConta;
	}


}