import java.util.Scanner;

public class EX6 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("DIGITE O PRIMEIRO N�MERO");
		int num1 = leitor.nextInt();
		System.out.println("DIGITE O SEGUNDO N�MERO");
		int num2 = leitor.nextInt();
		if (num1 < 0 || num2 < 0) {
			System.out.println("N�o � poss�vel digitar n�meros negativos");
		}
		System.out.println("Digite a op��o desejada");
		int op = leitor.nextInt();
		int resultado;

		if (op == 1) {
			resultado = num1 + num2;
			System.out.println(resultado);
		}
		if (op == 2) {
			resultado = num1 - num2;
			System.out.println(resultado);
		}
		if (op == 3) {
			resultado = num1 * num2;
			System.out.println(resultado);
		}
		if (op == 4) {
			if (num2 == 0) {
				System.out.println("N�mero 0 n�o � divisivel");
			}
			resultado = num1 / num2;
			System.out.println(resultado);
		} else if (op > 4 || op < 1) {
			System.out.println("Op��o n�o existente");
		}
	}

}
