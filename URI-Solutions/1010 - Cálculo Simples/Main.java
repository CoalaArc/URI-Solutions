import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Main {

  public static void main(String[] args) throws IOException {

    int codigo1, quantidade1;
    int codigo2, quantidade2;
    double valor1, valor2, valor;

    Scanner read = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");

    codigo1 = read.nextInt();
    quantidade1 = read.nextInt();
    valor1 = read.nextDouble();
    codigo2 = read.nextInt();
    quantidade2 = read.nextInt();
    valor2 = read.nextDouble();

    valor = quantidade1 * valor1 + quantidade2 * valor2;

    System.out.println("VALOR A PAGAR: R$ " + df.format(valor));

  }

}