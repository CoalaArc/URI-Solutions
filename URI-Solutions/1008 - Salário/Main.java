import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Main {

  public static void main(String[] args) throws IOException {

    int numero;
    int horas;
    double valorHora;
    double salario;

    Scanner read = new Scanner(System.in);

    numero = read.nextInt();
    horas = read.nextInt();
    valorHora = read.nextDouble();

    salario = horas * valorHora;

    System.out.println("NUMBER = " + numero);
    System.out.printf("SALARY = U$ %.2f\n", salario);

  }

}