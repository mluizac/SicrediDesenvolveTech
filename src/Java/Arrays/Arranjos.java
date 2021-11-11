package Java.Arrays;

public class Arranjos {
    public static void main(String[] args) {
        int[] vet = new int[20];
        int[] vet2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 100, 110, 120, 120, 120, 120,150};

        System.out.println("\nExibindo o arranjo: ");
        for (int i = 0; i < 20; i++) {
            vet[i] = (i + 1) * 10;
            if (i == 1) {
                vet[i] = 10;
            }
            System.out.println("vet[" + i + "]= " + vet[i]);
        }

        System.out.println("-----------------------------------------");
        System.out.println("Invertendo o arranjo: ");
        int j = 19;
        for (int i = 0; i < 10; i++) {
            int aux = vet[i];
            vet[i] = vet[j];
            vet[j] = aux;
            j--;
        }
        for (int i = 0; i < 20; i++) {
            System.out.println("vet[" + i + "]= " + vet[i]);
        }

        System.out.println("-----------------------------------------");
        System.out.println("Ocorrencias de um elemento: " + nOcorrencias(vet, 10));

        System.out.println("-----------------------------------------");
        System.out.println("Retorna true se tem um elemento repetido: " + hasRepeat(vet));

        System.out.println("-----------------------------------------");
        System.out.println("Quantidade de repetidos: " + nroRepeat(vet));

        System.out.println("-----------------------------------------");
        int[] x = listRepeat(vet);
        System.out.println("Lista de repetidos: ");
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }

        System.out.println("-----------------------------------------");
        System.out.println("A união de dois com.company.Arranjos:");
        union(vet, vet2);
        System.out.println();

        System.out.println("-----------------------------------------");
        System.out.println("A intersecção:");
        System.out.println(intersect(vet, vet2));
        int[] z = intersect(vet, vet2);
        for (int i = 0; i < z.length; i++) {
            System.out.println(z[i]);
        }

        System.out.println("-----------------------------------------");
        int[] y = difference(vet, vet2);
        System.out.println("A diferença:");
        for (int i = 0; i < y.length; i++) {
            System.out.println(y[i]);
        }
    }

    public static int nOcorrencias(int[] l, Integer el) {
        int cont = 0;
        for (int i = 0; i < l.length; i++) {
            if (l[i] == el) {
                cont++;
            }
        }
        return cont;
    }

    public static boolean hasRepeat(int[] l) {
        boolean numero = false;
        for (int i = 0; i < l.length; i++) {
            for (int f = 0; f < i; f++) {
                if (l[i] == l[f]) {
                    numero = true;
                }
            }
        }
        return numero;
    }

    public static int nroRepeat(int[] l) {
        int cont = 0;
        for (int i = 0; i < l.length; i++) {
            for (int f = 0; f < i; f++) {
                if (l[i] == l[f]) {
                    cont++;
                }
            }
        }
        return cont;
    }

    public static int[] listRepeat(int[] l) {
        int[] lista = new int[nroRepeat(l)];
        int cont = 0;
        for (int i = 0; i < l.length; i++) {
            for (int f = 1; f < i; f++) {
                if (l[i] == l[f]) {
                    lista[cont] = l[i];
                    cont++;
                }
            }
        }
        return lista;
    }

    public static int[] union(int[] l1, int[] l2) {
        int[] uniao = new int[(l1.length + l2.length)];
        int cont = 0;
        for (int i = 0; i < l1.length; i++) {
            uniao[cont] = l1[i];
            System.out.print(uniao[cont] + " ");
            cont++;
        }
        for (int i = 0; i < l2.length; i++) {
            uniao[cont] = l2[i];
            System.out.print(uniao[cont] + " ");
            cont++;
        }
        return uniao;
    }

    public static int[] intersect(int[] l1, int[] l2) {
        int size = l1.length + l2.length;
        int[] lista = new int[size];
        int contador = 0;
        for (int i = 0; i < l1.length - 1; i++) {
            for (int j = 0; j < l2.length - 1; j++) {
                if (l1[i] == l2[j]) {
                    lista[contador] = l1[i];
                    System.out.println(lista[contador]);
                    contador++;
                }
            }
        }
        return lista;
    }

    public static int[] difference(int[] l1, int[] l2) {
        int diferenca = 0;
        int[] list = new int[diferenca];
        int k=0, cont=0;
        for (int i=0; i<l1.length; i++) {
            cont=0;
            for (int j=0; j<l2.length; j++) {
                if (l1[i] == l2[j]) {
                    cont++;
                }
            }
            if (cont==0) {
                list[k] = l1[i];
                System.out.println("Esse numero: "+ l1[i]);
                k++;
            }
        }
        return list;
    }
}


