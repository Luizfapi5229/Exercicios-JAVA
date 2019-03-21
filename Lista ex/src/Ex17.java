import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		 
	    int v[] = new int[5]; 
	    int i,x,y; 
		int aux;
		for(x=0; x<5; x++) {
		System.out.printf("Informe os 5 valores do vetor: ");
		v[x] = leitor.nextInt();	
		}
		
		 for(x=0; x<5; x++) {
			for(y=0; y<x; y++) {
				if(v[x] < v[y]) {
					aux = v[x];
					v[x] = v[y];
					v[y]=aux;
				} 
				
			} 
			 
			 
		 }
		 System.out.println("VALORES EM ORDEM CRESCENTE: ");
		for(x=0; x<5; x++) {
			System.out.println(v[x]);
		}
		 
	}

}