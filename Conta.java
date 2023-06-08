public class Conta {

    double saldoConta;
    void sacar(double valor) {
        this.saldoConta -= valor;
    }
    int numeroConta;
    void transferir(Conta transfere, Conta recebe, double valor){
        if(transfere.saldoConta>=valor){
        transfere.sacar(valor);
        recebe.saldoConta+= valor;}
        else{

        }
    }

}