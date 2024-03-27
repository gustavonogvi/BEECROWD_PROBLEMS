package BEE_PROBLEMS_RECURSIVITY;

import java.util.Scanner;

public class Bee1029{
    static int calls = 0;

    public static int fibonacci(int n) {
        calls++;
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCasos = sc.nextInt();

        for(int i = 0; i < numCasos; i++) {
            calls = 0;
            int n = sc.nextInt();
            int result = fibonacci(n);
            System.out.println("fib(" + n + ") = " + (calls - 1) + " calls = " + result);
        }

        sc.close();
    }
}
