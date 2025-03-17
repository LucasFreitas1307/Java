import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scan1 = new Scanner(System.in);
            // Entrada de valores dos lados do triângulo
        System.out.println("Digite o primeiro lado do triângulo desejado:");
        int lado1 = Scan1.nextInt();

        System.out.println("Digite o segundo lado do triângulo desejado:");
        int lado2 = Scan1.nextInt();

        System.out.println("Digite o terceiro lado do triângulo desejado:");
        int lado3 = Scan1.nextInt();

        // Verificação da classificação do triângulo
        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Triângulo Equilátero");
        } else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
            System.out.println("Triângulo Escaleno");
        } else {
            System.out.println("Triângulo Isósceles");
        }

        Scan1.close();
    }
}
