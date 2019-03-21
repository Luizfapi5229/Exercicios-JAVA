import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		int num1 = lerNumero("Digite o primeiro numero");
		int num2 = lerNumero("Digite o segundo numero");
		int num3 = lerNumero("Digite o terceiro numero");
		comparaNum(num1,num2,num3);

	}

	public static void comparaNum(int num1, int num2, int num3) {

		if (num1 < num2 && num2 < num3) {
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(num3);
		} else if (num1 < num3 && num3 < num2) {
			System.out.println(num1);
			System.out.println(num3);
			System.out.println(num2);
		} else if (num2 < num1 && num1 < num3) {
			System.out.println(num2);
			System.out.println(num1);
			System.out.println(num3);
		} else if (num2 < num3 && num3 < num1) {
			System.out.println(num2);
			System.out.println(num3);
			System.out.println(num1);
		} else if (num3 < num1 && num1 < num2) {
			System.out.println(num3);
			System.out.println(num1);
			System.out.println(num2);
		} else if (num3 < num2 && num2 < num1) {
			System.out.println(num3);
			System.out.println(num2);
			System.out.println(num1);
		}

	}

	public static int lerNumero(String string) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um núemro");
		return leitor.nextInt();
	}
}

//	num1 num2 num3
//	num1 num3 num2
//	num2 num1 num3
//	num2 num3 num1
//	num3 num1 num2
//	num3 num2 num1
