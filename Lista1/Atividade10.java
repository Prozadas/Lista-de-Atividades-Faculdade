import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de itens: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Quantidade inválida");
        } else {
            double[] precos = new double[n];
            int[] qtd = new int[n];
            double total = 0;

            for (int i = 0; i < n; i++) {
                System.out.print("Preço unitário do item " + (i + 1) + ": ");
                precos[i] = sc.nextDouble();
                System.out.print("Quantidade do item " + (i + 1) + ": ");
                qtd[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                double sub = precos[i] * qtd[i];
                System.out.printf("Subtotal do item %d: R$ %.2f\n", i + 1, sub);
                total = total + sub;
            }

            System.out.printf("Total da compra: R$ %.2f\n", total);

            double pagar = total;
            if (total > 200) {
                double desc = total * 0.05;
                System.out.printf("Desconto de 5%%: R$ %.2f\n", desc);
                pagar = total - desc;
            }

            System.out.printf("Valor final a pagar: R$ %.2f\n", pagar);
        }
    }
}