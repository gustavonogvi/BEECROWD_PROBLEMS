package BEE_PROBLEMS_BASICS;

import java.util.Scanner;

public class Bee2760 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String var1 = scanner.nextLine();
        String var2 = scanner.nextLine();
        String var3 = scanner.nextLine();

        System.out.println(var1 + var2 + var3);
        System.out.println(var2 + var3 + var1);
        System.out.println(var3 + var1 + var2);

        int i = 0;
        while (i < 10 && i < var1.length()) {
            System.out.print(var1.charAt(i));
            i++;
        }

        i = 0;
        while (i < 10 && i < var2.length()) {
            System.out.print(var2.charAt(i));
            i++;
        }

        i = 0;
        while (i < 10 && i < var3.length()) {
            System.out.print(var3.charAt(i));
            i++;
        }

        System.out.println();
    }
}
