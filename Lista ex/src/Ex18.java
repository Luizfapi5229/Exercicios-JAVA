import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int vetor[] = new int[10];
		int aux = 0;
		int x;
		int y;
	
		
		System.out.println("Digite 10 numeros:");
		for ( x = 0; x < 10; x++) {
			vetor[x] = ler.nextInt();
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
		for ( x = 0; x < 10; x++) {

			System.out.println(vetor[x]);
		}

	}

}

