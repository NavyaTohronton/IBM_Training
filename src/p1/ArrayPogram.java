package p1;

public class ArrayPogram {

	public static void main(String[] args) {
		
		/* int a[]= new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50; */
		int a[]= {10,20,35,45,50};
		
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}

	}

}
