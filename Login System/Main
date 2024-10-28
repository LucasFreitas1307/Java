package com.example.cyberbee;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CyberbeeApplication {
	public static void main(String[] args) {
        SistemaDeAutenticacao sistema = new SistemaDeAutenticacao();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Fazer login");
            System.out.println("3 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            if (opcao == 1) {
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("Email: ");
                String email = scanner.nextLine();
                System.out.print("Senha: ");1
                String senha = scanner.nextLine();
                sistema.cadastrarUsuario(nome, email, senha);

            } else if (opcao == 2) {
                System.out.print("Email: ");
                String email = scanner.nextLine();
                System.out.print("Senha: ");
                String senha = scanner.nextLine();
                sistema.login(email, senha);

            } else if (opcao == 3) {
                System.out.println("Saindo...");
                break;

            } else {
                System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
	
	

}
