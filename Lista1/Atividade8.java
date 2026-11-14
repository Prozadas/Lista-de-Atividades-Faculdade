import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[10];
        int aprov = 0;
        int rec = 0;
        int reprov = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Nota do aluno " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();

            if (notas[i] >= 6) {
                aprov++;
            } else if (notas[i] >= 4) {
                rec++;
            } else {
                reprov++;
            }
        }

        System.out.println("Aprovados: " + aprov);
        System.out.println("Em recuperação: " + rec);
        System.out.println("Reprovados: " + reprov);
    }
}