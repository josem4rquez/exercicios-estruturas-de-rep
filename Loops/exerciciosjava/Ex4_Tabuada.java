package Loops.exerciciosjava;

import java.util.Scanner;

public class Ex4_Tabuada {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de " + tabuada);

        for(int i = 1; i <= 10; i = i + 1) {
            System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
        }
    }
    
}
