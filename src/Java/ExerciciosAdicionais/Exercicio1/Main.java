package Java.ExerciciosAdicionais.Exercicio1;

public class Main {

    public static void main(String[] args) {

        Elevador e1 = new Elevador();

        e1.inicializa(10, 10);
        e1.sobe();
        System.out.println(e1.getAndarAtual());
        e1.sobe();
        e1.sobe();
        e1.sobe();
        System.out.println(e1.getAndarAtual());
        e1.desce();
        System.out.println(e1.getAndarAtual());
        e1.entra();
        System.out.println(e1.getCapacidadeAtual());
        e1.entra();
        e1.entra();
        System.out.println(e1.getCapacidadeAtual());
        e1.sai();
        System.out.println(e1.getCapacidadeAtual());

        e1.inicializa(2, 2);
        e1.entra();
        System.out.println(e1.getCapacidadeAtual());
        e1.entra();
        e1.entra();
        System.out.println(e1.getCapacidadeAtual());
        e1.sai();
        System.out.println(e1.getCapacidadeAtual());
        e1.sai();
        e1.sai();
        e1.sobe();
        e1.sobe();
        e1.sobe();
        System.out.println(e1.getAndarAtual());
        e1.desce();
        System.out.println(e1.getAndarAtual());

    }
}
