package BEE_PROBLEMS_BASICS;

import java.util.Scanner;

public class Bee1176 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long[] fibonacci = new long[61];

        preencherFibonacci(fibonacci);

        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            System.out.println("Fib(" + N + ") = " + fibonacci[N]);
        }

        scanner.close();
    }

    public static void preencherFibonacci(long[] fibonacci) {
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i <= 60; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
    }
}
