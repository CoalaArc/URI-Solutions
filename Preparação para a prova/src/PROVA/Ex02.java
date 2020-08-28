package PROVA;

public class Ex02 {
    public static void main(String[] args) {


        int
                i=1,
                sinal=1;
        double
                termo = 1,
                somatorio = 0;

        while (Math.abs(termo) >= 0.0001)
        {
            termo = (double)4/(2*i-1)*sinal;
            sinal = sinal*(-1);

            if (Math.abs(termo) >= 0.0001)
            {
                somatorio = somatorio + termo;
            }
            i++;
        }
        System.out.printf("π: %.4f%n",somatorio);
    }
}
