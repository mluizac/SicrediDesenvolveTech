package Java.HerançaEPolimorfismo.Exercicio1;

public class Administrativo extends Assistente{

    private double bonusNoturno = 200;
    private String turno = "dia";

    public double getBonusNoturno(double salario) {
        return salario + bonusNoturno;
    }

    //CONSTRUTOR:
    public Administrativo(String nome, double salario, String NroMatricula, String turno) {
        super(nome, salario, NroMatricula);
        this.turno = turno;
        if(turno == "noite") {
            setSalario(salario+bonusNoturno);
        }
    }

}
