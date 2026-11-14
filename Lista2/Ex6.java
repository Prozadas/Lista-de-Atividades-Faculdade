import java.util.Scanner;

public class Ex6 {

    public static int contarVogais(String texto) {
        texto = texto.toLowerCase();
        int cont = 0;
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                cont++;
            }
        }
        return cont;
    }

    public static void exibirContagem(String[] frases) {
        int maior = 0;
        String fraseMaior = frases[0];

        for (int i = 0; i < frases.length; i++) {
            int qtd = contarVogais(frases[i]);
            System.out.println(frases[i] + " -> " + qtd + " vogais");
            if (qtd > maior) {
                maior = qtd;
                fraseMaior = frases[i];
            }
        }

        System.out.println("Frase com mais vogais: " + fraseMaior);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] frases = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite a frase " + (i + 1) + ": ");
            frases[i] = sc.nextLine();
        }

        exibirContagem(frases);
    }
}