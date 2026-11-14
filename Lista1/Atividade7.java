import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] sal = new double[6];
        double soma = 0;

        for (int i = 0; i < 6; i++) {
            System.out.print("Salário do funcionário " + (i + 1) + ": ");
            sal[i] = sc.nextDouble();
            soma = soma + sal[i];
        }

        double maior = sal[0];
        double menor = sal[0];

        for (int i = 1; i < 6; i++) {
            if (sal[i] > maior) {
                maior = sal[i];
            }
            if (sal[i] < menor) {
                menor = sal[i];
            }
        }

        double med = soma / 6;
        int cont = 0;

        for (int i = 0; i < 6; i++) {
            if (sal[i] > med) {
                cont++;
            }
        }

        System.out.printf("Maior salário: R$ %.2f\n", maior);
        System.out.printf("Menor salário: R$ %.2f\n", menor);
        System.out.printf("Média: R$ %.2f\n", med);
        System.out.println("Ganham acima da média: " + cont);
    }
}