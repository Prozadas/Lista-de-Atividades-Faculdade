import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cods = {101, 205, 310, 420, 550};
        double[] precos = {4.50, 12.00, 7.90, 25.00, 3.20};

        System.out.print("Digite o código do produto: ");
        int cod = sc.nextInt();
        boolean achou = false;

        for (int i = 0; i < 5; i++) {
            if (cods[i] == cod) {
                System.out.printf("Preço: R$ %.2f\n", precos[i]);
                achou = true;
            }
        }

        if (achou == false) {
            System.out.println("Produto não encontrado");
        }
    }
}