package FPPProject;

public class StarTrinangle {

	public static void main(String[] args) {
		// CREATE A TRIANGLE WITH *
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i > j) {
					System.out.print("*");
				}
			}
			System.out.println("*");
		}

	}

}
