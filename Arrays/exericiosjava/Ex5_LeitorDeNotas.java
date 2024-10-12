package Arrays.exericiosjava;

public class Ex5_LeitorDeNotas {
    public static void main(String[] args) {

        int[] notas = {6, 7, 9, 8};
        double soma = 0;

        System.out.print("Notas: ");
        int count = 0;

        while (count < (notas.length)) {
            System.out.println(notas[count] + " ");
            count++;
        }

        for (int i= 0; i < notas.length;  i++) {
           soma += notas[i];

        }
        System.out.println("Media das Notas: " + soma/4);
    }
    
}
