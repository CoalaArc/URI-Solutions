package PROVA;

public class Ex2 {
    public static void main(String[] args) {

        int
                x,
                M,
                C,
                D,
                U,
                aux,
                i;


        for (i=1000; i<=9999; i++)
        {
            M = i/1000;
            aux = i%1000;
            C = aux/100;
            aux = i%100;
            D = aux/10;
            U = aux%10;

            for (x=10; x<=19; x++)
            {
                if ((M*10+C)*(M*10+C) + (D*10+U)*x == i)
                    System.out.println(i);
            }
        }
    }
}
