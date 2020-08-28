package com.company;

import java.util.Scanner;

public class Og {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int
                L,
                R;

        L = input.nextInt();
        R = input.nextInt();

        while (L>0 && R>0)
        {
            System.out.printf("%d%n", L + R);

            L = input.nextInt();
            R = input.nextInt();
        }
    }
}
