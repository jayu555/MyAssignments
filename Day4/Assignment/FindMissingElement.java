package Day4.Assignment;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int a[] = {1,4,3,2,8,6,7};
		int n = a.length+1;
		
		int sum=(n*(n+1))/2;
		for(int i=0; i<a.length; i++) {
			sum=sum-a[i];
		}
		System.out.println("Missing number is : "+sum);
		

	}

}
