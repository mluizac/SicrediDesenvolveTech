package Java.HerançaEPolimorfismo.Exercicio2.DiagramaAnimal;

public class Animal {

    private String nome;
    private String raca;

    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public void caminha() {
        System.out.println("CAMINHANDO");
    }

    public void exibeDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Raça: " + getRaca());
        caminha();
    }
}
