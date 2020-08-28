package com.company;

import java.util.Scanner;

public class Idades {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int
                count=0,
                somaIdade=0,
                idade;

        idade = input.nextInt();
        while (idade >= 0)
        {
            somaIdade = somaIdade + idade;
            count++;
            idade = input.nextInt();
        }

        System.out.printf("%.2f%n", (float)somaIdade/count);
    }
}
