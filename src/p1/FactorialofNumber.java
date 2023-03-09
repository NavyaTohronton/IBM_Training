package p1;

public class FactorialofNumber {

	public static void main(String[] args) {
		int n=5,i,fact=1;
		for(i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of "+n+ " is "+fact);

	}

}
