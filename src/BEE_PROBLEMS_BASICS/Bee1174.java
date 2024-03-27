package BEE_PROBLEMS_BASICS;

import java.util.Scanner;

public class Bee1174 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] vetor = new double[100];

        for (int i = 0; i < 100; i++) {
            vetor[i] = sc.nextDouble();
        }

        for (int i = 0; i < 100; i++) {
            if (vetor[i] <= 10.0) {
                System.out.printf("A[%d] = %.1f\n", i, vetor[i]);
            }
        }

        sc.close();
    }
}
