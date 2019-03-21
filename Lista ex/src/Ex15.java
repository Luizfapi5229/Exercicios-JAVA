import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		 
	    int v[] = new int[5]; 
	    int i,x; 
		
		for(x=0; x<5; x++) {
		System.out.printf("Informe os 5 valores do vetor");
		v[x] = leitor.nextInt();	
		}
		
		   for (i=5; i>=0; i--) {	     
			      System.out.println("Os valores alocados no vetor são: " +v[i]);
			    }
		
	}

}
