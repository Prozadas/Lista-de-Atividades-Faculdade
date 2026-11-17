import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] m = new int[3][3];
        int soma = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = entrada.nextInt();
                soma = soma + m[i][j];
            }
        }

        System.out.println("Soma: " + soma);

        entrada.close();
    }
}