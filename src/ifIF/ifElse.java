package ifIF;

import java.util.Scanner;

public class ifElse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Type your number");
		int n=scan.nextInt();
		
		if(n%2==0) {
			System.out.println("The number "+n+" is even");
		}else {
			System.out.println("the number "+n+"  is odd");
		}

	}

}
