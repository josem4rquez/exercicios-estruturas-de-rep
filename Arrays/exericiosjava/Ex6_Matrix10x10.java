package Arrays.exericiosjava;

import java.util.Random;

public class Ex6_Matrix10x10 {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] M = new int [10][10];

        for(int i = 0; i < M.length; i++) {
            for(int j = 0; j < M[i].length; j++) {
                M[i][j] = random.nextInt(9);

            }
        }

        int menorColuna5 = Integer.MAX_VALUE;
        int maiorColuna5 = Integer.MIN_VALUE;
        int menorColuna7 = Integer.MAX_VALUE;
        int maiorColuna7 = Integer.MIN_VALUE;

        System.out.println("Valores da coluna 5 e 7 por linha: ");

        for (int i = 0; i < M.length; i++) {
            System.out.println("Linha" + i + " - coluna 5: " + M[i][4] + " | Coluna 7: " + M[i][6]);

            if (M[i][4] < menorColuna5) menorColuna5 = M[i][4];
            if (M[i][4] > maiorColuna5) maiorColuna5 = M[i][4];

            if (M[i][6] < menorColuna7) menorColuna7 = M[i][6];
            if (M[i][6] > maiorColuna7) maiorColuna7 = M[i][6];
        }
        System.out.println("Matriz: ");
        for (int[] linha : M) {
            for (int coluna : linha) {
                System.out.print(coluna + " ");
            }
            System.out.println();
        }
        System.out.println("\nMenor valor da coluna 5: " + menorColuna5);
        System.out.println("Maior valor da coluna 5: " + maiorColuna5);

        System.out.println("\nMenor valor da coluna 7: " + menorColuna7);
        System.out.println("Maior valor da coluna 7: " + maiorColuna7);



    }
    
}
