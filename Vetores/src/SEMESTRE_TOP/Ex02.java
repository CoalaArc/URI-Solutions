package SEMESTRE_TOP;

import java.util.Random;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();


        int
                i,
                j,
                NE1,
                NE2;
        int[]
                CJ1 = new int[250],
                CJ2 = new int[250];
        String
                NP;
        boolean
                disjuntivo = true;

        NP = input.next();
        while (NP.intern() != "VAZIO")
        {
            disjuntivo = true;
            NE1 = input.nextInt();
            NE2 = input.nextInt();
            for (i=0; i<NE1; i++) CJ1[i] = rnd.nextInt();
            for (i=0; i<NE2; i++) CJ2[i] = rnd.nextInt();

            if (NE1 > NE2)
            {
                for (i=0; i < NE2 && disjuntivo; i++)
                {
                    for (j = 0; j < NE1 && disjuntivo; j++) if (CJ1[i] == CJ2[j]) disjuntivo = false;
                }
                if (disjuntivo)
                {
                    System.out.printf("O par %s possui conjuntos disjuntos.\n", NP);
                } else System.out.printf("O par %s não possui conjuntos disjuntos.\n", NP);
            } else {
                for (i=0; i < NE1 && disjuntivo; i++)
                {
                    for (j = 0; j < NE2 && disjuntivo; j++) if (CJ1[j] == CJ2[i]) disjuntivo = false;
                }
                if (disjuntivo)
                {
                    System.out.printf("O par %s possui conjuntos disjuntos.\n", NP);
                } else System.out.printf("O par %s não possui conjuntos disjuntos.\n", NP);
            }
            NP = input.next();
        }

    }
}
