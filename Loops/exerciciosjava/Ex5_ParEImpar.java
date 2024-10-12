package Loops.exerciciosjava;

import java.util.Scanner;


public class Ex5_ParEImpar {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        int  quantNumeros;
        int numero;
        int quantPares = 0; 
        int quantImpares = 0;

        System.out.println("Quantidade de Numeros: ");
        quantNumeros = scan.nextInt();

        int count = 0;
        do{
            System.out.println("Numeros: ");
            numero = scan.nextInt();

            if (numero % 2 ==0 ) quantPares++;
            else quantImpares++;

            count++;
        } while(count < quantNumeros);

        System.out.println("Quantidade Par: " + quantPares);
        System.out.println("Quantidade Impar: " + quantImpares);
    }
    
}
