package com.company;

import java.util.Scanner;

public class SystemOfADownload {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int
                i,
                C,
                x,
                y;

        C = input.nextInt();

        for (i=0; i<C; i++)
        {
            x = input.nextInt();
            y = input.nextInt();

            switch (x+y)
            {
                case 0:
                    System.out.println("PROXYCITY");
                    break;
                case 1:
                    System.out.println("P.Y.N.G.");
                    break;
                case 2:
                    System.out.println("DNSUEY!");
                    break;
                case 3:
                    System.out.println("SERVERS");
                    break;
                case 4:
                    System.out.println("HOST!");
                    break;
                case 5:
                    System.out.println("CRIPTONIZE");
                    break;
                case 6:
                    System.out.println("OFFLINE DAY");
                    break;
                case 7:
                    System.out.println("SALT");
                    break;
                case 8:
                    System.out.println("ANSWER!");
                    break;
                case 9:
                    System.out.println("RAR?");
                    break;
                case 10:
                    System.out.println("WIFI ANTENNAS");
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + x + y);
            }
        }
    }
}
