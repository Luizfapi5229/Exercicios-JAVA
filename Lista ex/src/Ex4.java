import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite 3 números");
		System.out.println("Número 1");
		int num1 = leitor.nextInt();
		System.out.println("Número 2");
		int num2 = leitor.nextInt();
		System.out.println("Número 3");
		int num3 = leitor.nextInt();
		
		
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
			
		}
	
//	num1 num2 num3
//	num1 num3 num2
//	num2 num1 num3
//	num2 num3 num1
//	num3 num1 num2
//	num3 num2 num1

	


