import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		int num1 = lerNumero("digitar primeiro núemro");
		int num2 = lerNumero("digitar segundo núemro");
		compararNum(num1, num2);

	}

	private static void compararNum(int num1, int num2) {
		if (num1 < num2) {
			System.out.println("O menor núemro é: " + num1);
		} else {
			System.out.println("O menor número é: " + num2);
		}
	}

	public static int lerNumero(String string) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um núemro");
		return leitor.nextInt();

	}

}
