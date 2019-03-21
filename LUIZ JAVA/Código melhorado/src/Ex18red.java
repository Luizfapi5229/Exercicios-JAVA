import java.util.Scanner;

public class Ex18red {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int[] vetor = ordenarVet(leitor);
		mostrarVet(vetor);

	}

	public static int[] ordenarVet(Scanner leitor) {
		int x;
		int y; 
		int num;
		int aux;
		int[] vetor = new int[10];
		
		for ( x = 0; x < 10; x++) {
			System.out.println("Digite 10 numeros:");
			vetor[x] = leitor.nextInt();
		}
		for ( x = 0; x < 10; x++) {
			for ( y = 0; y < 10; y++) {
				if (vetor[x] < vetor[y]) {
					aux = vetor[x];
					vetor[x] = vetor[y];
					vetor[y] = aux;
				}
			}
		}
	return vetor;}

	public static int[] mostrarVet(int[] vetor) {
		int i;
		for (i = 0; i < 10; i++) {
			System.out.println(vetor[i]);
		}

		return vetor;
	}

}
