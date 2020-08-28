package com.company;

import java.util.Scanner;

public class IO_Date {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String
                data;
        char[]
                dd = new char[2],
                mm = new char[2],
                aa = new char[2];

        data = in.next();

        dd[0] = data.charAt(0);
        dd[1] = data.charAt(1);

        mm[0] = data.charAt(3);
        mm[1] = data.charAt(4);

        aa[0] = data.charAt(6);
        aa[1] = data.charAt(7);

        String
                dia = new String(dd),
                mes = new String(mm),
                ano = new String(aa);

        for (int i=0; i<3; i++)
        {
            if (i == 0) System.out.printf("%s/%s/%s%n", mes, dia, ano);
            if (i == 1) System.out.printf("%s/%s/%s%n", ano, mes, dia);
            if (i == 2) System.out.printf("%s-%s-%s%n", dia, mes, ano);
        }
    }
}
