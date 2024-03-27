package BEE_PROBLEMS_BASICS;

import java.util.Scanner;

public class Bee2837 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int L = scanner.nextInt();
        int H = scanner.nextInt();

        int[] S = new int[N];
        int[] M = new int[N];

        for (int i = 0; i < N; i++) {
            S[i] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            M[i] = scanner.nextInt();
        }

        int result = solve(N, L, H, S, M);
        System.out.println(result);
        scanner.close();
    }

    public static int solve(int N, int L, int H, int[] S, int[] M) {
        int result = Integer.MIN_VALUE;//menor valor inteiro possivel de ser representado com 32bits

        for (int i = 0; i < N; i++) {
            int sum = 0;
            int markedCount = 0;

            for (int j = i; j < N; j++) {
                sum += S[j];
                markedCount += M[j];

                if (markedCount >= L && markedCount <= H) {
                    result = Math.max(result, sum);
                } else if (markedCount > H) {
                    break;
                }
            }
        }

        return result;
    }
}
