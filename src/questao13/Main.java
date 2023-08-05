package questao13;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 6; j >= 1; j--) {
                int soma = i + j;
                if (soma == 7) {
                    System.out.println(i + " + " + j + " = " + soma);
                }
            }
        }
    }
}
