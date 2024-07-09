//Program to demonstrate Exception Handling
public class Demo.java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			System.out.println("Main Starts");
			try {
				int res=2/0;
				System.out.println("res="+res);
			}
			catch(ArithmeticException e)
			{
				System.out.println("Exception caught"+e);
			}
			System.out.println("Main Ends");
			}
	}

}
	
