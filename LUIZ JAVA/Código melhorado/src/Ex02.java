import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		int num1 = lerNumero("digitar primeiro n�emro");
		int num2 = lerNumero("digitar segundo n�emro");
		compararNum(num1, num2);

	}

	private static void compararNum(int num1, int num2) {
		if (num1 < num2) {
			System.out.println("O menor n�emro �: " + num1);
		} else {
			System.out.println("O menor n�mero �: " + num2);
		}
	}

	public static int lerNumero(String string) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um n�emro");
		return leitor.nextInt();

	}

}
