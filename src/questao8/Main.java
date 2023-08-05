package questao8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor: ");
        int valor = scanner.nextInt();

        if (valor % 2 == 0) {
            System.out.println(valor + " é par!");
        }
        else {
            System.out.println(valor + " é impar!");
        }

        scanner.close();
    }
}
