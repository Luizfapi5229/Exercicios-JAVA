import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o n�mero do m�s desejado de 1 a 12");
		int mes = leitor.nextInt();
		
		switch(mes){
			case 1:
				System.out.println("1 Janeiro");
				break;
			case 2:
				System.out.println("2 Fevereiro");
				break;
			case 3:
				System.out.println("3 Mar�o");
				break;
			case 4:
				System.out.println("4 Abril");
				break;
			case 5:
				System.out.println("5 Maio");
				break;
			case 6:
				System.out.println("6 Junho");
				break;
			case 7:
				System.out.println("7 Julho");
				break;
			case 8:
				System.out.println("8 Agosto");
				break;
			case 9:
				System.out.println("9 Setembro");
				break;
			case 10:
				System.out.println("10 Outubro");
				break;
			case 11:
				System.out.println("11 Nov1embro");
				break;
			case 12:
				System.out.println("12 Dezembro");
				break;
			default:
				System.out.println("M�s n�o existente");
		}
	}

}
