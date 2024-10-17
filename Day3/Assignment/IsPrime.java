package Day3.Assignment;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n = scan.nextInt();
		
		for(int i=2; i<n; i++) {
			
			if(n%i == 0) {
				System.out.println("The Given number is Prime");
				break;
			}
			else {
				System.out.println("The given number is not Prime");
				break;
			}
			
		}
	}

}
