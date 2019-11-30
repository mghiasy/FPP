package FPPProject;

import java.util.Scanner;

public class SwitchStatement {

	//INTRODUCTION OF SWITCH CASE STATEMENTS
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intSample();
	}
	public static void intSample() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Picka an integer in the range 1..9");
		int a = sc.nextInt();
		
		switch(a)
		{
		case  2 : 
		case  4 : 
		case  6 :
		case  8 : 
			System.out.println("you choose an even number");
			break;
		default :
			System.out.println("you choose an odd number");
			break;
		}
		sc.close();
		
	}

}
