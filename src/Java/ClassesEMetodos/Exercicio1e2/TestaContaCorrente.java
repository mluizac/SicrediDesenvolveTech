package Java.ClassesEMetodos.Exercicio1e2;

public class TestaContaCorrente {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente(123456);

        System.out.println("Inicializa o nro da conta:");
        System.out.println(c1.getNroConta());

        c1.deposito(1000);
        System.out.println("Inicializa o saldo:");
        System.out.println(c1.getSaldo());

        c1.deposito(500);
        System.out.println("Incrementa o saldo:");
        System.out.println(c1.getSaldo());

        c1.retirada(3000);
        System.out.println("Retirada inválida:");
        System.out.println(c1.getSaldo());

        c1.retirada(800);
        System.out.println("Retirada válida:");
        System.out.println(c1.getSaldo());

    }
}
