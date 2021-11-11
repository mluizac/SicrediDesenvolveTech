package Java.HerançaEPolimorfismo.Exercicio3;

public class Vip extends Ingresso{

    private double ValorVip = getValor()+5.00;

    public double getValorVip() {
        return ValorVip;
    }

    public void imprimeValor(){
        System.out.println(getValorVip());
    }
}
