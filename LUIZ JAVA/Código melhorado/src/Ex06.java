import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		int num1 = lerNum("Digite o primeiro numero");
		int num2 = lerNum("Digite o segundo numero");
		if (num1 < 0 || num2 < 0) {
			System.out.println("N�o � poss�vel digitar n�meros negativos");
		} else {
			int op = lerOp("Digite op��o");
			calculadora(op, num1, num2);
		}

	}

	public static void calculadora(int op, int num1, int num2) {
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

	public static int lerNum(String string) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um n�emro");
		return leitor.nextInt();
	}

	public static int lerOp(String string) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite uma op��o");
		return leitor.nextInt();

	}

}
