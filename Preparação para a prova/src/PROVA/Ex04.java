package PROVA;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int
                N,
                i,
                polig;

        double
                areaPoligno,
                perimetro,
                raio;

        System.out.print("Informe o número de polignos: ");
        polig = input.nextInt();


        for (i=0; i<polig; i++)
        {
            System.out.print("Digite o número de lados que o poligno possui: ");
            N = input.nextInt();
            System.out.print("Digite o valor do raio da circunferência: ");
            raio = input.nextDouble();

            //calculo da area do poligno
        }

    }
}
