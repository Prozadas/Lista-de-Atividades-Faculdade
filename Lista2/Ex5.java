import java.util.Scanner;

public class Ex5 {

    public static String paraBinario(int n) {
        if (n == 0) {
            return "0";
        }
        String bin = "";
        for (int x = n; x > 0; x = x / 2) {
            bin = (x % 2) + bin;
        }
        return bin;
    }

    public static void exibirTabela(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i] + " = " + paraBinario(v[i]));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] v = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            v[i] = sc.nextInt();
        }

        exibirTabela(v);
    }
}