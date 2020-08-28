package matrizes;

import java.util.Scanner;

public class AFINIDADES {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int
                mocas = 3,
                rapazes = 3,
                resposta = 2;
        String[][]
                R = new String[mocas][resposta],
                M = new String[rapazes][resposta];
        int[][]
                TA = new int[mocas][rapazes];
        int
                k,
                i,
                j;

        System.out.println("Informe S para Sim, N para Não ou I para Indiferente.");
        for (i=0; i<rapazes; i++)
        {
            System.out.printf("%d° Rapaz%n", i+1);
            for (j=0; j<resposta; j++)
            {//ler respostas dos rapazes
                System.out.printf("%d° Resposta: ", j+1);
                R[i][j] = input.next();
            }
        }
        for (i=0; i<mocas; i++)
        {
            System.out.printf("%d° Moça%n", i+1);
            for (j=0; j<resposta; j++)
            {//ler respostas das mocas
                System.out.printf("%d° Resposta: ", j+1);
                M[i][j] = input.next();
            }
        }

        for (i=0; i<rapazes; i++)
        {
            for (k=0; k<mocas; k++)
            {
                for (j=0; j<resposta; j++)
                {
                    if (M[i][j].intern() == "I" || R[k][j].intern() == "I")
                    {
                        TA[i][k] = TA[i][k] + 1;
                    }
                    else if ((M[i][j].intern() == "S" && R[k][j].intern() == "S") || (M[i][j].intern() == "N" && R[k][j].intern() == "N"))
                    {
                        TA[i][k] = TA[i][k] + 1;
                    }
                }
            }
        }

        for (i=0; i<mocas; i++)
        {
            for (j=0; j<rapazes; j++)
            {
                System.out.print(" " + TA[i][j]);
            }
            System.out.println();
        }
    }
}
