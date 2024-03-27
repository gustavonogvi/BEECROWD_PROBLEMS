package BEE_PROBLEMS_BASICS;

import java.util.Scanner;
public class Bee1153 {
    public static int fatorial(int numero) {
        if (numero == 0) {
            return 1;
        } else {
            return numero * fatorial(numero - 1);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int resultado = fatorial(num);
        System.out.println(resultado);
    }
}

