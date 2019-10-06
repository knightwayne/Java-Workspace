package javaBasic;
public class exceptionhandling 
{
public static void main(String args[])
{
	int a,b,c=0;
	try
	{
		a=5;
		b=0;
	if(b==0)
		throw new ArithmeticException();
	else
		c=a/b;
	}
	catch(ArithmeticException e)
	{
		System.out.println("Division by 0 : " + e);
	}
	System.out.println(c);
}
}
