import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Calcular Média Ponderada");
            System.out.println("2 - Verificar se o Número é Positivo");
            System.out.println("3 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) { //Criação do menu (comentar em português é mais legal fodase os gringos)
                case 1:
                    calcularMediaPonderada(scanner);
                    break;
                case 2:
                    verificarNumeroPositivo(scanner);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        } while (opcao != 3);

        scanner.close();
    }

    public static void calcularMediaPonderada(Scanner scanner) {
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
    }

    public static void verificarNumeroPositivo(Scanner scanner) {
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        boolean ehPositivo = numero > 0;
        System.out.println("O número é positivo? " + ehPositivo);

        if (ehPositivo) {
            System.out.println("Sim, o número é positivo.");
        } else {
            System.out.println("Não, o número é negativo ou zero.");
        }
    }
}
