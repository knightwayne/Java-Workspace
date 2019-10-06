
package javaBasic;

public class thread
{
public static void main(String args[])
{
	Thread t;
	t=Thread.currentThread();
	System.out.println(t);
	t.setName("MainThread");
	System.out.println(t.getName());
	try
	{
	for(int i=1;i<=5;i++)
	{
		System.out.println(i);
		Thread.sleep(500);
	}
	}
	catch(InterruptedException e)
	{
		System.out.println(e);
	}
}
}
