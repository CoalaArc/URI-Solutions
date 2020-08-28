import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int[] notas = { 100, 50, 20, 10, 5, 2 };
		BigDecimal[] moedas = { BigDecimal.ONE, new BigDecimal("0.50"), new BigDecimal("0.25"), new BigDecimal("0.10"),
				new BigDecimal("0.05"), new BigDecimal("0.01") };

		Scanner read = new Scanner(System.in);
		BigDecimal dinheiro = read.nextBigDecimal();

		System.out.println("NOTAS:");
		// Pega o valor da variavel "dinheiro" e divide por
		// cada nota contida no array "notas"
		for (int nota : notas) {
			BigDecimal[] divide = dinheiro.divideAndRemainder(new BigDecimal(nota));
			System.out.printf("%d nota(s) de R$ %d.00\n", divide[0].intValue(), nota);
			dinheiro = divide[1];
		}
		// Pega o valor restante da divisão feita acima
		// da variavel "dinheiro" e divide por cada moeda contida no array "moedas"
		System.out.println("MOEDAS:");
		for (BigDecimal n : moedas) {
			BigDecimal[] divide = dinheiro.divideAndRemainder(n);
			System.out.printf("%d moeda(s) de R$ %.2f\n", divide[0].intValue(), n);
			dinheiro = divide[1];
		}
	}
}