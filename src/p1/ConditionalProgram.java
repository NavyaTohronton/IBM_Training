package p1;

public class ConditionalProgram {

	public static void main(String[] args) {
		
		int x=5;
		if(x>10) {
			System.out.println("Number is greater than 10");
		}
		else {
			System.out.println("Number is less than or equal to 10");
		}
		int y=20;
		if(y%3==0) {
			System.out.println("Given number is divisible by 3");
		}
		else if(y%5==0) {
			System.out.println("Given number is divisible by 5");
		}
		else if(y%7==0) {
			System.out.println("Given number is divisible by 7");
		}
		else {
			System.out.println("Given number is not divisible by 3,5 and 7");
		}

	}

}
