import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		int num1 = lerNum("Digite o primeiro numero");
		int num2 = lerNum("Digite o segundo numero");
		compararNum(num1, num2);

	}

	private static void compararNum(int num1, int num2) {
		if (num1 > num2) {
			System.out.println("O maior n�emro �: " + num1);
		} else {
			System.out.println("O maior n�mero �: " + num2);
		}
	}

	public static int lerNum(String string) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um n�mero");
		return leitor.nextInt();
	}

}
