package FPPProject;

public class While2For {
		//CACULATE SUM WITH BOTH WHILE AND FOR LOOPS
	public static void main(String[] args) {
		int sum = 0;
		// int i=1; 
		// while(sum<10000) {
				//sum=sum+i;
				// System.out.println(sum); i++; 
		//} 
		//System.out.println(sum);

		for (int i = 1; sum < 10000; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

}
