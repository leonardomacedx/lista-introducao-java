package questao14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma = 0;
        int contador = 1;
        while (contador <= 50) {
            System.out.print(contador + "º valor: " );
            double valor = scanner.nextDouble();
            soma += valor;
            contador++;
        }

        double media = soma / 50;
        System.out.println(media);

        scanner.close();
    }
}
