package Java.ExerciciosAdicionais.Exercicio2;

public class ConcatenaString {

    public void concatena(String a, int n) {
        String b = a;
        for (int i=1; i<n; i++){
            a = a + b;
        }
        System.out.println(a);
    }
}
/*
 * b = php
 * a = php + php
 *
 * a(php-php) = php-php + php
 *
 * a(php) = php + php
 *
 * a(php-php) = php-php + php-php
 *
 * */

