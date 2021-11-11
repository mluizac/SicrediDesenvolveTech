package Java.ClassesEMetodos.Exercicio1e2;

public class TestaCadastroDeContas {
    public static void main(String[] args) {
    CadastroDeContas cad = new CadastroDeContas();

    System.out.println("Inseri conta valida: ");
    ContaCorrente c1 = new ContaCorrente(123456);
    c1.deposito(1000);
    cad.novaContaCorrente(c1);

    ContaCorrente c2 = cad.getConta(123456);
    System.out.println(c2.getNroConta());


    System.out.println(cad.getSaldoTotal(c1, c2));
    }
}
