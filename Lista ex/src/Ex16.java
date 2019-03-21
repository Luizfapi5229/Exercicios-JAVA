import java.util.Scanner;
public class Ex16 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int v[] = new int [10];
		int x,i;
		
		for(x = 0; x < 10; x++) {
			System.out.println("Digite o número "+(x+1));
			v[x] = leitor.nextInt();
		}
		for(i = 9; i >= 0; i--) {
			
			System.out.println(v[i]);
		}
	}

}
