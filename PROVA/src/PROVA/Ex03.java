package PROVA;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int
                i,
                j,
                k=0,
                NC1,
                NC2;

        long[]
                CPF1,
                CPF2,
                comum;

        NC1 = input.nextInt(); //leitura de quantos CPF's inadimplentes tem na primeira empresa
        CPF1 = new long[NC1];
        //leitura dos CPF's inadimplentes da primeira empresa
        for (i=0; i<NC1; i++) CPF1[i] = input.nextLong();


        NC2 = input.nextInt(); //leitura de quantos CPF's inadimplentes tem na segunda empresa
        CPF2 = new long[NC2];
        //leitura dos CPF's inadimplentes da segunda empresa
        for (i=0; i<NC2; i++) CPF2[i] = input.nextLong();


        comum = new long[NC1];
        //verifica os CPF's inadimplentes em comum nas duas empresas
        for (i=0; i<NC1; i++)
        {
            for (j=0; j<NC2 && CPF1[i] != CPF2[j]; j++);
            if (j<NC2)
            {
                comum[k] = CPF1[i];
                k++;
            }
        }

        //imprime os CPF's inadimplentes em comum nas duas empresas
        System.out.println("LISTA DE CPF's INADIMPLENTES NAS DUAS EMPRESAS:");
        for (i=0; i<k; i++)
        {
            System.out.println(comum[i]);
        }
    }
}
