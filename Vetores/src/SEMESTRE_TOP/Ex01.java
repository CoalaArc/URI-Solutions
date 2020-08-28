package SEMESTRE_TOP;

import java.util.Random;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Random rnd = new Random();

        int
                i,
                nota;
        int[]
                notas = new int[11];

        for (i=0; i<80; i++)
        {
            nota = input.nextInt();
            //nota = rnd.nextInt(11);
            switch (nota)
            {
                case 0:
                    notas[0] += 1;
                    break;
                case 1:
                    notas[1] += 1;
                    break;
                case 2:
                    notas[2] += 1;
                    break;
                case 3:
                    notas[3] += 1;
                    break;
                case 4:
                    notas[4] += 1;
                    break;
                case 5:
                    notas[5] += 1;
                    break;
                case 6:
                    notas[6] += 1;
                    break;
                case 7:
                    notas[7] += 1;
                    break;
                case 8:
                    notas[8] += 1;
                    break;
                case 9:
                    notas[9] += 1;
                    break;
                case 10:
                    notas[10] += 1;
                    break;
            }
        }
        System.out.print("              Notas");
        for (i=0; i<11; i++)
        {
            System.out.printf("    %d   ", i);
        }
        System.out.printf("\nFrequência absoluta");
        for (int n :
                notas) {
            if (n >= 10) System.out.printf("    %d  ", n);
            else System.out.printf("    %d   ", n);
        }
        System.out.printf("\nFrequência relativa");
        for (double n :
                notas) {
            System.out.printf("  %.3f ", n/80);
        }

    }
}
