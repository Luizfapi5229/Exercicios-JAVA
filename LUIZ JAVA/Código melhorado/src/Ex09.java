
public class Ex09 {

	public static void main(String[] args) {
		somaNum();
		
	}

	public static void somaNum() {
		int x, y;
		for (x = 0; x < 11; x++) {
			for (y = 0; y < 11; y++)
				x = x + y;
			System.out.println(x);
		}

	}

}
