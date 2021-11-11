package Java.HerançaEPolimorfismo;

import Java.HerançaEPolimorfismo.Exercicio1.Administrativo;
import Java.HerançaEPolimorfismo.Exercicio1.Assistente;
import Java.HerançaEPolimorfismo.Exercicio1.Funcionario;
import Java.HerançaEPolimorfismo.Exercicio1.Tecnicos;
import Java.HerançaEPolimorfismo.Exercicio2.DiagramaAnimal.Cachorro;
import Java.HerançaEPolimorfismo.Exercicio2.DiagramaAnimal.Gato;
import Java.HerançaEPolimorfismo.Exercicio3.Vip;

public class Main {

    public static void main(String[] args) {
        System.out.println("------Exercicio 1 -----");
        Funcionario funcionario = new Funcionario("Maria", 20.000);
        Funcionario assistente = new Assistente("Luiza",25.000, "123456"); //POLIMORFISMO
        Assistente tecnico = new Tecnicos("Carlos", 10000, "9999");
        Assistente administrativo = new Administrativo("Junior", 50.000, "5555","noite");
        funcionario.exibeDados();
        assistente.exibeDados();
        tecnico.exibeDados();
        administrativo.exibeDados();

        System.out.println("------Exercicio 2 -----");
        Gato gato = new Gato("faisca","vira-lata");
        Cachorro cachorro = new Cachorro("Niki","vira-lata");
        gato.caminha();
        gato.mia();
        cachorro.caminha();
        cachorro.late();

        System.out.println("------Exercicio 3 -----");

        Vip ingressoVip = new Vip();
        ingressoVip.imprimeValor();

    }
}
