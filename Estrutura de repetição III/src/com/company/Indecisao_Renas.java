package com.company;

import java.util.Scanner;

public class Indecisao_Renas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int
                j,
                resto,
                snowBall = 0;

        for (j=0; j<9; j++)
        {
            snowBall = snowBall + in.nextInt();
        }

        resto = snowBall%9;
        snowBall = snowBall/9;

        switch (resto)
        {
            case 1:
                System.out.println("Dasher");
                break;
            case 2:
                System.out.println("Dancer");
                break;
            case 3:
                System.out.println("Prancer");
                break;
            case 4:
                System.out.println("Vixen");
                break;
            case 5:
                System.out.println("Comet");
                break;
            case 6:
                System.out.println("Cupid");
                break;
            case 7:
                System.out.println("Donner");
                break;
            case 8:
                System.out.println("Blitzen");
                break;
            case 0:
                System.out.println("Rudolph");
                break;
        }
    }
}
