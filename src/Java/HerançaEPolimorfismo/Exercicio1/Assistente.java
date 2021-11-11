package Java.HerançaEPolimorfismo.Exercicio1;

public class Assistente extends Funcionario{

    private String nroMatricula;

    public String getNroMatricula(){
        return nroMatricula;
    }

    //CONSTRUTOR:
    public Assistente(String nome, double salario, String NroMatricula) {
        super(nome, salario); //ta chamando o construtor da classe pai (funcionario) sobrecarga
        this.nroMatricula = NroMatricula;
    }


    //SOBRESCREVENDO O METODO EXIBEDADOS DO FUNCIONARIO, OU SEJA ADD A MATRICULA, ALEM DOS QUE JA TEM QUE É NOME E SALARIO
    public void exibeDados() {
        System.out.println("Nome: " + getNome());
        System.out.println("Salario: " + getSalario());
        System.out.println("Matricula: " + getNroMatricula());
    }
}
