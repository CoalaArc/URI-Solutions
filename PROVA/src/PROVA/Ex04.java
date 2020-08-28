package PROVA;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int
                N,
                i,
                a,
                b,
                v;
        int[]
                numeros;

        N = input.nextInt();
        numeros = new int[N];
        for (i=0; i<N; i++) numeros[i] = 1; //todos os elementos dos vetores recebe 1;

        a = input.nextInt();
        b = input.nextInt();
        v = input.nextInt();

        while (a>=0 && b>=0)
        {//no intervalo de "a" até "b" substitui cada elemento nesse intervalo pelo produto dele com "v";
            for (i=a; i<=b; i++) numeros[i] = numeros[i]*v;

            //imprime o vetor
            for (i=0; i<N; i++) System.out.printf("%d ", numeros[i]);
            System.out.println();

            a = input.nextInt();
            b = input.nextInt();
            v = input.nextInt();
        }

    }
}
