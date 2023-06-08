public class Conta {

    double saldoConta;
    String nomeCliente;
    String dataNascimento;
    float extrato;
	
    void sacar(double valor) {
        this.saldoConta -= valor;
    }

    Double consultarSaldo(){
	return saldoConta;
    }

    void extrato () {
        System.out.println (this.nomeCliente", o extrato da sua conta é de: " this.extrato)
    }


}