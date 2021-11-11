package Java.HerançaEPolimorfismo.Exercicio2.DiagramaPessoa;

public class Pessoa {

    private String nome;
    private String idade;

    public Pessoa(String nome, String idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getIdade() {
        return idade;
    }

    public void exibeDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
    }
}
