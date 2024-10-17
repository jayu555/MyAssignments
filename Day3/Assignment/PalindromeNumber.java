package Day3.Assignment;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num : ");
		int num = sc.nextInt();
		int m=num;
		int rev=0;
		
		while(num > 0) {
			
			int digit = num%10;
			rev = rev*10+digit;
			num=num/10;	
		}
		System.out.println(rev);
		
		if(m == rev) {
			
			System.out.println("Palindrome");
		}
		else {
			
			System.out.println("Not Palindrome");
			
		}
	}

}
