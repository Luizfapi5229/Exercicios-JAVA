
public class Ex11ref {

	public static void main(String[] args) {

		multiplos();
	}

	public static void multiplos() {
		int x;
		for (x = 1; x < 1000; x++) {
			if (x % 2 == 0 & x % 3 == 0) {
				System.out.println("O número " + x + " é par e multiplo de três");

			}
		}

	}
}
