import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um n�mero");
		int num1 = leitor.nextInt();
		System.out.println("Digite segundo n�mero");
		int num2 = leitor.nextInt();
		
		if(num1 < num2) {
		System.out.println("O menor n�mero �: "+ num1);
		}else if(num2 < num1){
			System.out.println("O menor n�mero �: "+ num2);
		}else {
			System.out.println("Os n�meros s�o iguais");
		}
	}

}
