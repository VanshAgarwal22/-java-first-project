package unit_03;



import java.io.IOException;
import java.util.Scanner;

public class P14_Task01_exceptionJava {
	
	public void basicexception()
	{
		int a =0;
	int b = 100/a;
	System.out.println("exception not  occur");
		
	}
	public void handledexception()
	{
		int a =0;
	try
		{
		int b = 100/a;
		System.out.println("exception not  occur");//after determine the error it goes to the catch block and this line  not print//  
		
	}
		catch(ArithmeticException e)
		{

			System.out.println(e);
		}
	}
	public void mulcatch()
	{
		int a =0;
		try
		{
		int b = 100/a;
		System.out.println("exception not  occur");//after determine the error it goes to the catch block and this line  not print//  
		
		}
		catch(ArithmeticException e)
		{
	
			System.out.println(e);
		}
		catch(Exception e)//try block will not execute if the error is not come //
		{
	
			System.out.println(e);
			System.out.println("cannot divide by the zaro");
		}
	}
	
	public void notexception()
	{
		try
		{
			int c = 2;
			while(c>0)
			{
				System.out.println(c);
				c++;
				
			}
		}
		
		catch(Exception e)
		{
			System.out.println("stack overflow");//its an error not an exception
		}
	System.out.println("bla bla");
	
	}
	
	public void typemismatch()
	{
		Scanner in = new Scanner(System.in);
		
		try {
			int a = in.nextInt();
			
		}
		catch(Exception a)
		
		{
			System.out.println("character mismatch");
		}
	}
	public void outofbond()
	{
		String s ="vansh";
		try
		{
			char ch = s.charAt(45);
			
		}
		catch(Exception d)
		{
			System.out.println("limit cross of string :");
		}
	}
	
	public void nullpointer()
	{
		
		try
		{
		String a = null;
		System.out.println(a.toLowerCase());
			
		}
		catch(Exception d)
		{
			System.out.println(d); //reason print of exception
			System.out.println("null value cannot converted");
		}
	}
	
	void useOfThrow(int age) throws Exception, ArithmeticException, IOException {

		if (age < 18) {
			throw new Exception();
		} else {
			System.out.println("You are allowed to enter");
		}

	}

	/*
	 * Sometime you don't need to handle the Exception When in multi chain calling
	 * is there, then it can be handled by the supper most method then inner methods
	 * need not to handle it there
	 */
	void useOfThrows_And_Finally() {

		try {
			useOfThrow(17);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	

	void checkedAndUncheckedException() {

		/*
		 * Unchecked Exception: Run time catching - Here we are dividing by 0 - which
		 * will not be caught at compile time - as there is no mistake but caught at
		 * runtime - because it is mathematically incorrect
		 */
		int x = 0;
		int y = 10;
		int z = y / x;

		System.out.println(z);

		// Checked Exception [Run this code over terminal and check compiler error]
		try {
			useOfThrow(19);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}
	
	void manualExceptionThrow() {

		try {

			// Have to use try and Catch here!
			calculateArea(-1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	void calculateArea(int r) throws ManualException 
	{

		if (r < 0)
		{
			throw new ManualException();
		}

		int area = r * r;
		System.out.println(area);

	}



@SuppressWarnings("serial")
class ManualException extends Exception {

	@Override
	public String getMessage() {
		String detailMessage = "Exception Occured!";
		return detailMessage;
	}

}
	public static void main(String[] args) {
		P14_Task01_exceptionJava c = new P14_Task01_exceptionJava();
		//c.typemismatch();
		//c.notexception();
		//c.mulcatch();
		//c.handledexception();
		//c.basicexception();
		//c.outofbond();
		//c.nullpointer();
		//c.checkedAndUncheckedException();
		c.manualExceptionThrow();	
		
	}
}
