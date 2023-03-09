package p1;

public class SumofAllEvenNumberofArray {

	public static void main(String[] args) {
		int a[]= {10,20,30,45};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				sum=sum+a[i];
				
			}
			
		}
		System.out.println("sum of all even numbers of array "+sum);

	}

}
