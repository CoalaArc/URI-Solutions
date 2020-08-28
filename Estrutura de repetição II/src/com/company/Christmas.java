package com.company;

import java.util.Scanner;

public class Christmas {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int
                days,
                month,
                day;

        while (input.hasNext())
        {
            month = input.nextInt();
            day = input.nextInt();

            switch (month)
            {
                case 1:
                    days = day;
                    break;
                case 2:
                    //janeiro
                    days = 31+day;
                    break;
                case 3:
                    //fevereiro
                    days = 60+day;
                    break;
                case 4:
                    //março
                    days = 91+day;
                    break;
                case 5:
                    //abril
                    days = 121+day;
                    break;
                case 6:
                    //maio
                    days = 152+day;
                    break;
                case 7:
                    //junho
                    days = 182+day;
                    break;
                case 8:
                    //julho
                    days = 213+day;
                    break;
                case 9:
                    //agosto
                    days = 244+day;
                    break;
                case 10:
                    //setembro
                    days = 274+day;
                    break;
                case 11:
                    //outubro
                    days = 305+day;
                    break;
                case 12:
                    //novembro
                    days = 335+day;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + month);
            }

            if (days == 359) System.out.println("E vespera de natal!");
            else if (days == 360) System.out.println("E natal!");
            else if (days > 360) System.out.println("Ja passou!");
            else System.out.printf("Faltam %d dias para o natal!%n", 360-days);
        }
    }
}
