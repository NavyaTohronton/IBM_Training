package p1;

public class NumberofWordsinString {

	public static void main(String[] args) {
		String str="This is Full Stack Tester Training";
		int count=1;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println("Number of words in given string is "+count);

	}

}
