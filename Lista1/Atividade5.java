import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] precos = new double[5];
        double[] desc = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Preço do produto " + (i + 1) + ": ");
            precos[i] = sc.nextDouble();
            desc[i] = precos[i] - precos[i] * 0.10;
        }

        for (int i = 0; i < 5; i++) {
            System.out.printf("Produto %d: original R$ %.2f | com desconto R$ %.2f\n", i + 1, precos[i], desc[i]);
        }
    }
}