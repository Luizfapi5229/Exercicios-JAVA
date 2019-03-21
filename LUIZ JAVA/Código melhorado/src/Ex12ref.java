import java.util.Scanner;

public class Ex12ref {

	public static void main(String[] args) {
		int num1 = lerNumero("Escolha do primeiro núemro");
		int num2 = lerNumero("Escolha do segundo núemro");
		mostrarNum(num1,num2);
	}

	public static void mostrarNum(int num1, int num2) {
		if(num1 < 11 & num1 > 0 & num2 < 11 & num2 > 0 & num1 != num2) {
			for(int x=1; x<=1000; x++){
				if(x%num1==0 & x%num2==0) {
					System.out.println(x);
				}
				
			}
			
		}
	}
	
	
	
	public static int lerNumero(String string) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite números para somar e 0 para resultado");
		return leitor.nextInt();

	}
}
