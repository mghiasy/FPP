package FPPProject;

public class SunElementsByForeach {

	public static void main(String[] args) {
		//FOR & FOR EACH LOOP ON ARRAY
				int[] arr = { 2, 6, 75, 5, 7, 1, -3 };
				int total = 0;
				int max = 0;
//FOREACH LOOP
				for (int item : arr) {
					total += item;
					if (item > max) {
						max = item;
					}
				}
				
				System.out.println("Sum is: " + total);
				System.out.println("Max is: " + max);
			}
	}


