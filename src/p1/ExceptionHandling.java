package p1;

public class ExceptionHandling {

	public static void main(String[] args) throws InterruptedException{
		int balance=50;
		int month=0;
		int avg_bal=0;
		//Thread.sleep(300);
		//avg_bal=balance/month;
		int amt=5000;
		int withdraw_amt=7000;
		try {
		if(withdraw_amt>amt) {
			throw new ArithmeticException("Number of month is 0");
		}
		else {
			avg_bal=amt/month;
			System.out.println("avg_balance is "+avg_bal);
		} }
		catch (Exception e ) {
			System.out.println("Hey");
		}
		/*try {
		avg_bal=balance/month;
		System.out.println("next line");
		}
		/*catch(Exception e) {
			e.printStackTrace();
			System.out.println("you just started account, so avg balance is 0");
		}*/
	/*	catch (ArithmeticException e) {
			System.out.println("yes");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("no");
		}
		
		finally {
			System.out.println("Thankyou for banking with us");
		}*/
		System.out.println("avg balance is "+avg_bal);

	
	}

}
