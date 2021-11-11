package Java.ClassesEMetodos.Exercicio1e2;

public class CadastroDeContas {
    private ContaCorrente[] cad = new ContaCorrente[100];
    private int nroContas = 0;


    public boolean novaContaCorrente(ContaCorrente c) {
        boolean res = false;
        if(nroContas > 100 || c!= null) {
            cad[nroContas] = c;
            nroContas++;
            res = true;
        }
        return res;
    }


    public ContaCorrente getConta(int nro) {
        ContaCorrente res;
        int i;
        for(i = 0; i <nroContas; i++) {
            if(nro == cad[i].getNroConta()) {
                break;
            }
        }
        if (i == nroContas) {
            res = null;
        }
        else
            res = cad[i];
        return res;
    }


    public double getSaldoTotal(ContaCorrente x, ContaCorrente y) {
        double saldos = x.getSaldo() + y.getSaldo();
        return saldos;
    }

    public int qtdContas(double noMinimo) {
        return 0;
    }
}
