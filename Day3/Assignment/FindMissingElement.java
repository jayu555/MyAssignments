package Day3.Assignment;

import java.util.Scanner;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner sc=new Scanner(System.in);
	      System.out.println("Enter the total number of elements ");
	      int n=sc.nextInt();     

	      int arr[]=new int[n];   
	      System.out.println("Enter the elements of the array ");
	      for(int i=0; i<n ;i++)   
	      {
	          arr[i]=sc.nextInt();
	      }
	      
	      int sum=(n+1)*(n+2)/2;   
	      for(int i=0;i<n;i++)
	      {
	          sum=sum-arr[i];
	      }
	      System.out.println("Missing Element is "+sum);
		

	}

}
