package PROVA;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int
                i;
        final int
                alunos = 3,
                QTnotas = 4;

        double[]
                notas = new double[alunos*QTnotas];

        for (i=0; i<notas.length; i++) notas[i] = input.nextDouble();

        for (i=0; i<alunos; i++)
        {
            System.out.printf("Média do %d° aluno: %.2f\n"
                    , i+1, (notas[i] + (notas[i+alunos]) + (notas[i+alunos*2]) + (notas[i+alunos*3]))/4);
        }
    }
}
