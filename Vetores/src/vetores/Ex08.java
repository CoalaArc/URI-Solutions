package vetores;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[]
                par = new int[5],
                impar = new int[5];
        int
                countPar,
                countImpar,
                j,
                i,
                N;
        for (i=0, countPar=0, countImpar=0; i<15; i++)
        {
            N = input.nextInt();

            if (countPar == 5) //imprime o que tem no vetor Par e zera o contador par
            {
                j=0;
                for (int output: par)
                {
                    System.out.printf("par[%d] = %d%n", j, output);
                    j++;
                }
                countPar=0;
            }
            if (countImpar == 5)//imprime o que tem no vetor Impar e zera o contador impar
            {
                j=0;
                for (int output: impar)
                {
                    System.out.printf("impar[%d] = %d%n", j, output);
                    j++;
                }
                countImpar=0;
            }

            if (N%2 == 0) // se for par entra aqui
            {
                par[countPar] = N;
                countPar++;
            }
            else // se for impar entra aqui
            {
                impar[countImpar] = N;
                countImpar++;
            }
        }

        // imprime o que tem nos vetores par e impar depois de informado os 15 numeros
        for (i=0; i<countImpar; i++)
        {
            System.out.printf("impar[%d] = %d%n", i, impar[i]);
        }
        for (i=0; i<countPar; i++)
        {
            System.out.printf("par[%d] = %d%n", i, par[i]);
        }
    }
}
