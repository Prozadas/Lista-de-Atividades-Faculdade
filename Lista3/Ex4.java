import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] m = new int[2][3];
        int pares = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = entrada.nextInt();

                if (m[i][j] % 2 == 0) {
                    pares++;
                }
            }
        }

        System.out.println("Quantidade de pares: " + pares);

        entrada.close();
    }
}