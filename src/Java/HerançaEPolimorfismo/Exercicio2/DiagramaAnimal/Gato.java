package Java.HerançaEPolimorfismo.Exercicio2.DiagramaAnimal;

import Java.HerançaEPolimorfismo.Exercicio2.DiagramaAnimal.Animal;

public class Gato extends Animal {

    public Gato(String nome, String raca) {
        super(nome, raca);
    }

    public void mia() {
        System.out.println("MIAU");
    }

    @Override
    public void exibeDados() {
        super.exibeDados();
        mia();
    }
}

