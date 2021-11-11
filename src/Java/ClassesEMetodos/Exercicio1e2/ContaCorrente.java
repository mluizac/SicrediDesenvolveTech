package Java.ClassesEMetodos.Exercicio1e2;

public class ContaCorrente {
    //Atributos:
    private int nroConta;
    private double saldo = 0.0;


    //Construtor:
    public ContaCorrente(int n){
        nroConta = n;
    }


    //Métodos
    public void deposito(double valor){
        if(valor > 0)
            saldo += valor; //saldo = saldo + valor
    }

    public double retirada(double valor){
        if(saldo - valor >= 0)
            saldo -= valor;
        return saldo;
    }


    public double getSaldo(){
        return saldo;
    }


    public int getNroConta(){
        return nroConta;
    }
}
