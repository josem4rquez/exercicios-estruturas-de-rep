package Loops.exerciciosjava;

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;

        for(int i = fatorial ; i >= 1 ; i --) {
            multiplicacao = multiplicacao * i;

        }

        System.out.println(fatorial +"! = " + multiplicacao);

    }
    
}
