package BEE_PROBLEMS_BASICS;

import java.util.Scanner;

public class Bee1005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();

        double media = (A * 3.5 + B * 7.5) / 11;

        System.out.printf("MEDIA = %.5f%n", media);
        //EU BOTEI "X=" E NAO "MEDIA="
    }
}
