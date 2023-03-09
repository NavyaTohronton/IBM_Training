package p1;

public class Palindrome {

	public static void main(String[] args) {
		String str="madame";
		int left=0, right=str.length()-1;
		boolean val=true;
		while(left<right) {
		if(str.charAt(left)!=str.charAt(right)) {
			val=false;
			}
		left++;
		right--;

	}
		if(val==true) {
		System.out.println("String is a palindrome");
	}
		else {
			System.out.println("String is not a palindrome");
		}
	}
}
