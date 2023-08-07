package questao12;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                int resultInt = i / 2;
                System.out.println("Int: " + i + " / 2 = " + resultInt);
                double resultDouble = (double) i / 2;
                System.out.println("Double: " + i + " / 2 = " + resultDouble);
            }
        }
    }
}
