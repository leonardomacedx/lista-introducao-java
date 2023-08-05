package questao15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        int contador = 1;

        do {
            System.out.print(contador + "º valor: ");
            double valor = scanner.nextDouble();
            soma += valor;
            contador++;
        } while (contador <= 50);

        double media = soma / 50;
        System.out.println("Média: " + media);
        scanner.close();
    }
}
