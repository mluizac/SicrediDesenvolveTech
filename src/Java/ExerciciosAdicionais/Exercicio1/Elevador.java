package Java.ExerciciosAdicionais.Exercicio1;

public class Elevador {

    private int andarAtual = 0;
    private int totalAndares;
    private int capacidade;
    private int capacidadeAtual = 0;

    public int getAndarAtual() {
        System.out.println("Andar atual: ");
        return andarAtual;
    }

    public int getTotalAndares() {
        System.out.println("Total de andares do elevador: ");
        return totalAndares;
    }

    public int getCapacidade() {
        System.out.println("Capacidade máxima do elevador: ");
        return capacidade;
    }

    public int getCapacidadeAtual() {
        System.out.println("Quantidade atual de pessoas no elevador: ");
        return capacidadeAtual;
    }

    public void setAndarAtual(int andarAtual){
        this.andarAtual = andarAtual;
    }

    public void setTotalAndares(int totalAndares){
        this.totalAndares = totalAndares;
    }

    public void setCapacidade(int capacidade){
        this.capacidade = capacidade;
    }

    public void setCapacidadeAtual(int capacidadeAtual) {
        this.capacidadeAtual = capacidadeAtual;
    }


    public void inicializa(int capacidade, int totalAndares) {
        if(andarAtual == 0 && capacidadeAtual == 0){
            System.out.println("Elevador iniciado");
            this.capacidade = capacidade;
            this.totalAndares = totalAndares;
        }
        else {
            System.out.println("Elevador descendo para o terreo e expulsando as pessoas");
            this.capacidadeAtual = 0;
            this.andarAtual = 0;
            this.capacidade = capacidade;
            this.totalAndares = totalAndares;
            //System.out.println("Elevador pronto para serviço");
        }
    }

    public void entra(){
        if(capacidadeAtual < capacidade) {
            capacidadeAtual++;
            System.out.println("Entrou no elevador");
        }
        else {
            System.out.println("Elevador já atingiu sua capacidade máxima!");
        }
    }

    public void sai(){
        if(capacidadeAtual > 0){
            capacidadeAtual--;
            System.out.println("Saiu do elevador");
        }
        else {
            System.out.println("Não há ninguém no elevador");
        }
    }

    public void sobe(){
        if(andarAtual < totalAndares) {
            this.andarAtual++;
            System.out.println("Elevador subindo...");
        }
        else {
            System.out.println("Elevador já está no ultimo andar!");
        }
    }

    public void desce(){
        if(andarAtual > 0) {
            andarAtual--;
            System.out.println("Elevador descendo...");
        }
        else {
            System.out.println("Elevador está no térreo, só sobe!");
        }
    }
}
