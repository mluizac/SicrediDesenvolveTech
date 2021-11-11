package Java.HerançaEPolimorfismo.Exercicio2.DiagramaAnimal;

import Java.HerançaEPolimorfismo.Exercicio2.DiagramaAnimal.Animal;

public class Cachorro extends Animal {

    public Cachorro(String nome, String raca) {
        super(nome, raca);
    }

    public void late() {
        System.out.println("AUAU");
    }

    @Override
    public void exibeDados() {
        super.exibeDados();
        late();
    }

}

