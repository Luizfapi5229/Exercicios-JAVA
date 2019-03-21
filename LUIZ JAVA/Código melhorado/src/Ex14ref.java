
public class Ex14ref {

	public static void main(String[] args) {
		
		mostrarNum();
	}

	private static void mostrarNum(){
		for(int x=-1000; x<0;x++) {
			if(x%2==-1 && x%9==0){
				System.out.println(x);
			}
		}
	}
	
	
}
