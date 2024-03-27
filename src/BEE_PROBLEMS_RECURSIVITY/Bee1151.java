package BEE_PROBLEMS_RECURSIVITY;

import java.util.Scanner;

public class Bee1151 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        if (x < 1) {
            return;
        }

        System.out.print(fibonacci(0, 1, x - 1));
        System.out.println();
    }

    public static String fibonacci(int a, int b, int count) {
        if (count == 0) {
            return Integer.toString(a);
        }

        return a + " " + fibonacci(b, a + b, count - 1);
    }
}
