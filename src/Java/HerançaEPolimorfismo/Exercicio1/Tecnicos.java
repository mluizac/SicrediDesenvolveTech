package Java.HerançaEPolimorfismo.Exercicio1;

public class Tecnicos extends Assistente{

    private double bonus = 100;

    public double getBonus(double salario) {
        return salario + bonus;
    }

    //CONSTRUTOR
    public Tecnicos(String nome, double salario, String NroMatricula) {
        super(nome, salario, NroMatricula); //extende da classe pai que é (assistente)
        setSalario(salario+bonus);
    }

}
