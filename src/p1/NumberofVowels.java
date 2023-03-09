package p1;

public class NumberofVowels {

	public static void main(String[] args) {
		String str="abcdef";
		int count=0;
		char ch[]=str.toCharArray();
		str=str.toUpperCase();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U') {
				count++;
		}
		}
		System.out.println("Number of vowels "+count);
	}

}
