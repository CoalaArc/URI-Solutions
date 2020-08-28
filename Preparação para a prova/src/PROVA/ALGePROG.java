package PROVA;

import java.util.Scanner;

public class ALGePROG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int
                j,
                NA,
                NF,
                i;
        int[]
                alg= new int[140],
                fund= new int[170];
        //Preenche as matriculas de Algoritmo
        for (i=0; i<alg.length && alg[i] != 0; i++) alg[i] = input.nextInt();
        NA = i;
        //Preenche as matriculas de Fundamentos
        for (i=0; i<fund.length && fund[i] != 0; i++) fund[i] = input.nextInt();
        NF = i;

        for (i=0; i<NA; i++)
        {
            for (j=0; j<NF && alg[i] != fund[j]; j++);
            if (j<NF)
            {
                System.out.printf("A matrícula %d está matriculada nas duas matérias.", alg[i]);
            } else System.out.printf("A matrícula %d não está matriculada nas duas matérias.", alg[i]);
        }
    }
}
