import java.util.Scanner;

public class EX6 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("DIGITE O PRIMEIRO NÚMERO");
		int num1 = leitor.nextInt();
		System.out.println("DIGITE O SEGUNDO NÚMERO");
		int num2 = leitor.nextInt();
		if (num1 < 0 || num2 < 0) {
			System.out.println("Não é possível digitar números negativos");
		}
		System.out.println("Digite a opção desejada");
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
				System.out.println("Número 0 não é divisivel");
			}
			resultado = num1 / num2;
			System.out.println(resultado);
		} else if (op > 4 || op < 1) {
			System.out.println("Opção não existente");
		}
	}

}
