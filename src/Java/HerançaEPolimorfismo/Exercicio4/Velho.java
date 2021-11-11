package Java.HerançaEPolimorfismo.Exercicio4;

public class Velho extends Imovel{

    private double desconto;

    public Velho() {
    }

    public Velho(String endereco, double preco, double desconto) {
        super(endereco, preco);
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void desconto() {
        System.out.println("Desconto do imóvel velho: R$ " + getDesconto());
        System.out.println("Valor total: R$ " + (getPreco() - getDesconto()));
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        desconto();
    }
}
