package Java.Lambda.Exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Vitor");
        stringList.add("Dante");
        stringList.add("Carol");
        stringList.add("Maria");
        stringList.add("Manu");
        stringList.add("Dani");
        stringList.add("Jhuan");
        stringList.add("Matheus");
        stringList.add("Vander");

        listSubstring(stringList, v -> v.toUpperCase());
        listSubstring(stringList, v -> v.toLowerCase());
    }

    public static void listSubstring(List<String> stringList, Substring s) {
        for (String string : stringList) {
            System.out.println(s.novaString(string));
        }
    }
}
