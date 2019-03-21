import java.util.Scanner;

public class Ex10 {
	
	public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);	
			int num;
			int soma = 0;
			
			do {
				System.out.println("Digite números para somar e 0 para resultado");
				num = leitor.nextInt();
				soma+=num;
	}	while(num != 0);	
		
	
	System.out.println(soma);
		
	}

}
