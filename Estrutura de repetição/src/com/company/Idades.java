package com.company;

import java.util.Scanner;

public class Idades {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int idade, i;
        double somaIdades = 0.0;

        for (i=0, idade=0; i<=idade; i++)
        {
            idade = input.nextInt();
            if (idade > 0)
            {
                somaIdades = somaIdades + idade;
            }
        }
        System.out.printf("%.2f", somaIdades/(i-1));
    }
}
