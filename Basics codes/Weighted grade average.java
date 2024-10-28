import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número de notas: ");
        int n = scanner.nextInt();

        double[] notas = new double[n];
        double[] pesos = new double[n];
        
        double somaNotasPonderadas = 0;
        double somaPesos = 0;

        // Leitura das notas e pesos
        for (int i = 0; i < n; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();

            System.out.print("Digite o peso da nota " + (i + 1) + ": ");
            pesos[i] = scanner.nextDouble();
        }

        // Cálculo da soma das notas ponderadas e dos pesos
        for (int i = 0; i < n; i++) {
            somaNotasPonderadas += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }

        // Cálculo da média ponderada
        double mediaPonderada = somaNotasPonderadas / somaPesos;

        System.out.println("A média ponderada é: " + mediaPonderada);

        scanner.close();
    }
}
