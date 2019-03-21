import java.util.Scanner;

public class Ex10ref {

	public static void main(String[] args) {

		somaNum();

	}

	public static void somaNum() {
		int soma = 0;
		int num;
		do {

			num = lerNumero("Digite os núemros para somar e 0 para resultado");
			soma += num;

		} while (num != 0);

		System.out.println(soma);
	}

	public static int lerNumero(String string) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite números para somar e 0 para resultado");
		return leitor.nextInt();

	}

}
