import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Main {

  public static void main(String[] args) throws IOException {

    String nome;
    double salarioFixo;
    double venda;
    double salarioFinal;

    Scanner read = new Scanner(System.in);

    nome = read.nextLine();
    salarioFixo = read.nextDouble();
    venda = read.nextDouble();

    salarioFinal = salarioFixo + (venda * 0.15);

    System.out.printf("TOTAL = R$ %.2f", salarioFinal);
    System.out.println();
  }

}
