package BEE_PROBLEMS_RECURSIVITY;

import java.util.Scanner;

public class Bee1028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int f1 = sc.nextInt();
            int f2 = sc.nextInt();
            int mdc = mdc(f1, f2);
            System.out.println(mdc);
        }

        sc.close();
    }

    public static int mdc(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return mdc(b, a % b);
        }
    }
}
