package vetores;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int
                posicao = 0,
                menorValor,
                i,
                N;
        int[]
                X;

        N = input.nextInt();
        X = new int[N];

        X[0] = input.nextInt();
        menorValor = X[0];
        for (i=1; i<X.length; i++)
        {
            X[i] = input.nextInt();
            if (X[i] < menorValor)
            {
                menorValor = X[i];
                posicao = i;
            }
        }

        System.out.printf("Menor valor: %d%n", menorValor);
        System.out.printf("Posicao: %d%n", posicao);
    }
}
