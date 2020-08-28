import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Main {

  public static void main(String[] args) throws IOException {

    int idadeDias, anos, meses, dias;

    Scanner read = new Scanner(System.in);

    idadeDias = read.nextInt();

    anos = idadeDias / 365;
    idadeDias %= 365;

    meses = idadeDias / 30;
    idadeDias %= 30;

    dias = idadeDias;

    System.out.println(anos + " ano(s)");
    System.out.println(meses + " mes(es)");
    System.out.println(dias + " dia(s)");

  }

}