package Java.HerançaEPolimorfismo.Exercicio1;

public class Funcionario {

    //--------------------------------------------
    //ATRIBUTOS E SETS E GETS
    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    //--------------------------------------------
    //CONSTRUTOR:
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    //-------------------------------------------
    //METODO
    public void exibeDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Salario: " + getSalario());
    }
}
