import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		int op = lerOp("Escolher opcão desejada");
		opcao(op);

	}

	public static void opcao(int op) {
		switch (op) {
		case 1:
			System.out.println("1: DESCONTO DE 12%");
			break;
		case 2:
			System.out.println("2: DESCONTO DE 3%");
			break;
		case 3:
			System.out.println("3: MESMO PREÇO");
			break;
		case 4:
			System.out.println("4:ACRÉSCIMO DE 5%");
			break;
		case 5:
			System.out.println("4:ACRÉSCIMO DE 10%");
			break;
		}

	}

	public static int lerOp(String string) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("MENU");
		System.out.println("1 - VENDA A VISTA NO DINHEIRO ");
		System.out.println("2 - VENDA A VISTA NO DÉBITO ");
		System.out.println("3 - 1x NO CARTÃO DE CRÉDITO");
		System.out.println("4 - 3x VEZES COM JUROS NO CARTÃO DE CRÉDITO");
		System.out.println("5 - 6X NO CARTÃO DE CRÉDITO");
		System.out.println("");
		System.out.println("DIGITE A OPCÃO DESEJADA");
		return leitor.nextInt();

	}

}
