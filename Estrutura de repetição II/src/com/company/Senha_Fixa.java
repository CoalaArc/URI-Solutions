package com.company;

import java.util.Scanner;

public class Senha_Fixa {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        final int Senha = 2002;
        int senha = 0;

        senha = input.nextInt();
        while (senha != Senha)
        {
            System.out.println("Senha Invalida");
            senha = input.nextInt();
        }

        System.out.println("Acesso Permitido");
    }
}
