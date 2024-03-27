package BEE_PROBLEMS_BASICS;

import java.util.Scanner;

public class Bee1179 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] par = new int[5];
        int[] impar = new int[5];

        int countPar = 0;
        int countImpar = 0;

        for (int i = 0; i < 15; i++) {
            int num = scanner.nextInt();

            if (num % 2 == 0) {
                par[countPar] = num;
                countPar++;
                if (countPar == 5) {
                    printVector("par", par, countPar);
                    countPar = 0;
                }
            } else {
                impar[countImpar] = num;
                countImpar++;
                if (countImpar == 5) {
                    printVector("impar", impar, countImpar);
                    countImpar = 0;
                }
            }
        }

        printVector("impar", impar, countImpar);
        printVector("par", par, countPar);

        scanner.close();
    }

    private static void printVector(String tipo, int[] vetor, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(tipo + "[" + i + "] = " + vetor[i]);
        }
    }
}

