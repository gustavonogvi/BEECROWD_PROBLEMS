package BEE_PROBLEMS_BASICS;

import java.util.Scanner;
public class Bee1114 {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);

        for(int i = 0; i<1000; i++) {
            int senha = prompt.nextInt();

            if (senha == 2002) {
                System.out.println("Acesso Permitido");
                break;
            }else{
                System.out.println("Senha Invalida");}
        }
    }
}