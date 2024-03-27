package BEE_PROBLEMS_BASICS;

import java.util.Scanner;

public class Bee1172 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];

        for (int i = 0; i < 10; i++) {
            vetor[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (vetor[i] <= 0) {
                vetor[i] = 1;
            }
            System.out.println("X[" + i + "] = " + vetor[i]);
        }
    }
}
