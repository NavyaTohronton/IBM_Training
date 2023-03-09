package p1;

public class ReverseofString {

	public static void main(String[] args) {
		String str="abcdef";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev+=str.charAt(i);
		}
		System.out.println("Reverse of given string is "+rev);

	}

}
