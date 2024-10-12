package Loops.exerciciosjava;

import java.util.Scanner;

public class Ex7_UserESenha {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        String usuario;
        String senha;


        while (true) {
            System.out.println("Insura Seu Usuario");
            usuario = scan.next();

            System.out.println("Insira Sua Senha:");
            senha = scan.next();
            
            if (usuario.equals(senha)) {
              System.out.println("O Usario e senha devem ser diferentes");
            } else break;
        }

        
        System.out.println("Login Feito com Sucesso");

        
    }
    
}
