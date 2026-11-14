import java.util.Scanner;

public class Ex3 {

    public static boolean ehPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int contarPrimos(int[] v) {
        int cont = 0;
        for (int i = 0; i < v.length; i++) {
            if (ehPrimo(v[i])) {
                cont++;
            }
        }
        return cont;
    }

    public static void exibirPrimos(int[] v) {
        System.out.println("Primos encontrados:");
        for (int i = 0; i < v.length; i++) {
            if (ehPrimo(v[i])) {
                System.out.println(v[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[8];

        for (int i = 0; i < 8; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            v[i] = sc.nextInt();
        }

        exibirPrimos(v);
        System.out.println("Quantidade de primos: " + contarPrimos(v));
    }
}