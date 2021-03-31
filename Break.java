package BraekContinue;

public class Break {
	public static void main(String[] args) {
		for (int count = 0; count <= 20; count++) {
			if (count == 11)
				break;
			System.out.println("Count " + count);
		}
	}
}

