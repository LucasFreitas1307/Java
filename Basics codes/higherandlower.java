import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada1 = new Scanner(System.in);

        System.out.print("Digite a quantidade de números que deseja inserir: ");
        int quant = entrada1.nextInt();

        if (quant <= 0) {
            System.out.println("A quantidade deve ser maior que zero.");
            return;
        }

        int[] vetor = new int[quant];

        System.out.println("Digite os números:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = entrada1.nextInt();
        }

        int maior = vetor[0], menor = vetor[0]; // assume o primeiro número como maior e menor
        int posMaior = 0, posMenor = 0; // armazena as posições do maior e menor valor

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posMaior = i; // posicao de vetor
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
                posMenor = i; // psicao de vetor
            }
        }

        System.out.println("\nMaior número: " + maior + " (posição: " + (posMaior + 1) + ")");
        System.out.println("Menor número: " + menor + " (posição: " + (posMenor + 1) + ")");

        entrada1.close();
    }
}
