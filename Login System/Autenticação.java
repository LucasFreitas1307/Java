package com.example.cyberbee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class SistemaDeAutenticacao {
	public boolean cadastrarUsuario(String nome, String email, String senha) {
        String sql = "INSERT INTO usuarios (nome, email, senha) VALUES (?, ?, ?)";
        
        try (Connection conn = DataBase.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, nome);
            stmt.setString(2, email);
            stmt.setString(3, senha);
            stmt.executeUpdate();
            
            System.out.println("Usuário cadastrado com sucesso!");
            return true;
            
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar usuário: " + e.getMessage());
            return false;
        }
    }

    public boolean login(String email, String senha) {
        String sql = "SELECT * FROM usuarios WHERE email = ? AND senha = ?";
        
        try (Connection conn = DataBase.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, email);
            stmt.setString(2, senha);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                System.out.println("Login realizado com sucesso!");
                return true;
            } else {
                System.out.println("Email ou senha incorretos.");
                return false;
            }
            
        } catch (SQLException e) {
            System.out.println("Erro ao realizar login: " + e.getMessage());
            return false;
        }
    }
}
