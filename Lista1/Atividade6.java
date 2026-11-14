import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor do empréstimo: ");
        double val = sc.nextDouble();
        System.out.print("Taxa de juros mensal (%): ");
        double taxa = sc.nextDouble();

        double[] devido = new double[12];

        for (int i = 0; i < 12; i++) {
            int mes = i + 1;
            devido[i] = val + val * taxa / 100 * mes;
        }

        for (int i = 0; i < 12; i++) {
            System.out.printf("Mês %d: R$ %.2f\n", i + 1, devido[i]);
        }
    }
}