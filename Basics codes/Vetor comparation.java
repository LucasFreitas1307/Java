import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada1 = new Scanner(System.in);

        System.out.print("Digite a quantidade de números que deseja inserir: ");
        int quant = entrada1.nextInt();

        int[] vetor = new int[quant];


        System.out.println("Digite os números:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = entrada1.nextInt();
            soma += vetor[i]; // soma
        }

        double media = (double) soma / quant; // calculo de media

        System.out.println("\nSoma dos números: " + soma);
        System.out.println("Média dos números: " + media);

        entrada1.close();
    }
}

