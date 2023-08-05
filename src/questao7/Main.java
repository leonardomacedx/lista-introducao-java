package questao7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A: ");
        int a = scanner.nextInt();
        System.out.print("B: ");
        int b = scanner.nextInt();

        int temporario = a;

        a = b;
        b = temporario;

        System.out.println("A = " + a);
        System.out.println("B = " + b);

        scanner.close();
    }
}