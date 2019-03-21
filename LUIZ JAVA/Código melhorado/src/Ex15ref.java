import java.util.Scanner;

public class Ex15ref {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int[] vetor = lerVet(leitor);
		mostrarVet(vetor);
	}

	public static int[] lerVet(Scanner leitor) {
		int x;
		int[] vetor = new int[5];
		for (x = 0; x < 5; x++) {
			System.out.println("Digite o núemro " +(x+1)+" para o vetor");
			vetor[x] = leitor.nextInt();
		}

		return vetor;
	}

	public static int[] mostrarVet(int[] vetor) {
		int i;
		for (i = 0; i < 5; i++) {

			System.out.println(vetor[i]);
		}

		return vetor;
	}

}
