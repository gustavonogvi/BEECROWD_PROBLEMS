package BEE_PROBLEMS_RECURSIVITY;

import java.util.Scanner;

public class Bee1030 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nc = scanner.nextInt();
        readInput(scanner, 1, nc);
        scanner.close();
    }

    public static void readInput(Scanner scanner, int currentCase, int totalCases) {
        if (currentCase > totalCases) {
            return;
        }

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int posicao = josephus(n, k);
        System.out.println("Case " + currentCase + ": " + posicao);

        readInput(scanner, currentCase + 1, totalCases);
    }

    private static int josephus(int n, int k) {
        if (n == 1) {
            return 1;
        } else {
            return (josephus(n - 1, k) + k - 1) % n + 1;
        }
    }
}
