import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Escolha dois números");
		int num1 = leitor.nextInt();
		int num2 = leitor.nextInt();
		if(num1 < 11 & num1 > 0 & num2 < 11 & num2 > 0 & num1 != num2) {
			for(int x=1; x<=1000; x++){
				if(x%num1==0 & x%num2==0) {
					System.out.println(x);
				}
				
			}
			
		}
	}

}
