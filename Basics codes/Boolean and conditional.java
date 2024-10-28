public class ExemploBooleano {
    public static void main(String[] args) {
        int numero = 5;
        boolean ehPositivo = numero > 0; // Atribui true se o número for maior que zero

        System.out.println("O número é positivo? " + ehPositivo);

        // Usando a variável booleana em uma condição
        if (ehPositivo) {
            System.out.println("Sim, o número é positivo.");
        } else {
            System.out.println("Não, o número é negativo ou zero.");
        }
    }
}
