package Java.Lambda.Exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer>lista = new ArrayList();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);

        System.out.println(novaLista(lista, (int n1, int n2) -> n1+n2)); //soma

        System.out.println(novaLista(lista, (int n1, int n2) -> (n1+n2)/2)); //média

        System.out.println(novaLista(lista, (int n1, int n2) -> {
            if(n1 > n2){
                return n1;
            }else
                return n2;
        }));

    }

    public static List novaLista(ArrayList<Integer> l, Inteiros inteiro){
        List listaNova = new ArrayList();
        for(int i=0; i<l.size()-1; i++){
            listaNova.add(inteiro.resultante(l.get(i), l.get(i+1)));
        }
        return listaNova;
    }
}
