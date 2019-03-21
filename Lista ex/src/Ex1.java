import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um número");
		int num1 = leitor.nextInt();
		System.out.println("Digite segundo número");
		int num2 = leitor.nextInt();
		
		if(num1 > num2) {
		System.out.println("O maior número é: "+ num1);
		}else if(num2 > num1){
			System.out.println("O maior número é: "+ num2);
		}else {
			System.out.println("Os números são iguais");
		}
	}

}
