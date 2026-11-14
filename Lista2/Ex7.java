import java.util.Scanner;

public class Ex7 {

    public static String gerarIniciais(String nomeCompleto) {
        String[] partes = nomeCompleto.trim().split(" ");
        String ini = "";
        for (int i = 0; i < partes.length; i++) {
            if (partes[i].length() > 0) {
                String palavra = partes[i].toUpperCase();
                ini = ini + palavra.charAt(0) + ".";
            }
        }
        return ini;
    }

    public static void exibirChamada(String[] nomes) {
        for (int i = 0; i < nomes.length; i++) {
            System.out.println((i + 1) + ". " + nomes[i] + " (" + gerarIniciais(nomes[i]) + ")");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[4];

        for (int i = 0; i < 4; i++) {
            System.out.print("Nome completo do aluno " + (i + 1) + ": ");
            nomes[i] = sc.nextLine();
        }

        exibirChamada(nomes);
    }
}