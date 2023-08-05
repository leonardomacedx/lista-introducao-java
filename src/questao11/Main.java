package questao11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Código do produto: ");
        String codigo = scanner.next();

        if (codigo.equals("001")) {
            System.out.println("Parafuso");
        }
        else if (codigo.equals("002")) {
            System.out.println("Porca");
        }
        else if (codigo.equals("003")) {
            System.out.println("Prego");
        }
        else {
            System.out.println("Diversos");
        }

        scanner.close();
    }
}
