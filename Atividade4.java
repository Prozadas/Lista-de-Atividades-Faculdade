import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] precos = new double[5];
        double total = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Preço do produto " + (i + 1) + ": ");
            precos[i] = sc.nextDouble();
            total = total + precos[i];
        }

        System.out.println("Preços lidos:");
        for (int i = 0; i < 5; i++) {
            System.out.printf("R$ %.2f\n", precos[i]);
        }

        System.out.printf("Total da compra: R$ %.2f\n", total);
    }
}