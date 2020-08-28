package vetores;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int
                aux,
                j,
                i;
        int[]
                N = new int[20];

        //leitura dos valores
        for (i=0; i < N.length; i++)
        {
            N[i] = input.nextInt();
        }
        //inversão de valores
        for (i=0, j=N.length -1; i<N.length/2; i++, j--)
        {
            aux = N[j];
            N[j] = N[i];
            N[i] = aux;
        }
        //output do vetor
        i=0;
        for (int output: N)
        {
            System.out.printf("N[%d] = %d%n", i, output);
            i++;
        }
    }
}
