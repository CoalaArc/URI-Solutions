package PROVA;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int
                aux,
                NS,
                pM,
                p,
                i,
                N;


        N = input.nextInt();
        while (N != 0)
        {
            for (i=0, aux=0, pM=0, p=0;i<N; i++)
            {
                NS = input.nextInt();
                if (aux > NS)
                {
                    p++;
                    if (p > pM) pM = p;
                }else p=1;

                aux = NS;
            }

            System.out.println(pM);
            //-------------------
            N = input.nextInt();
        }
    }
}
