package BEE_PROBLEMS_RECURSIVITY;

import java.util.Scanner;

public class Bee1031 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        readAndProcess(scanner);
        scanner.close();
    }

    private static void readAndProcess(Scanner scanner) {
        int n = scanner.nextInt();
        if (n == 0) {
            return;
        }

        int y = findY(n, 1);
        System.out.println(y);

        readAndProcess(scanner);
    }

    private static int findY(int n, int y) {
        if (remaining(n, y) != 11) {
            return findY(n, y + 1);
        }
        return y;
    }

    private static int remaining(int n, int k) {
        return remainingRecursive(n, k, 1, 0);
    }

    private static int remainingRecursive(int n, int k, int i, int r) {
        if (i < n) {
            r = (r + k) % i;
            return remainingRecursive(n, k, i + 1, r);
        }
        return r;
    }
}
