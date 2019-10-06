package javaBasic;
class NewThread1 implements Runnable
{

	NewThread1()
	{
		
		Thread t = new Thread("Child Thread");
		System.out.println("Child Thread "+t);
		t.start();
	}
	public void run() 
	{
		try
		{
			for(int i=5;i>=1;i--)
				System.out.println(i+" CT");
			Thread.sleep(500);
		}
		catch(InterruptedException e)
		{
			System.out.println("Child Interrupted"+e);
		}
		System.out.println("Child Thread Exiting");
	}
}
class NewThread2 extends Thread
{
	NewThread2()
	{
		Thread t = new Thread(this,"Child Thread_");
		System.out.println("Child Thread "+t);
		//t.start();
	}
	public void run() 
	{
		try
		{
			for(int i=15;i>10;i--)
				System.out.println(i+" CT_");
			Thread.sleep(500);
		}
		catch(InterruptedException e)
		{
			System.out.println("Child Interrupted"+e);
		}
		System.out.println("Child Thread_ Exiting");
	}
}
public class thread_1
{
	public static void main(String args[])
	{
		
		//implements Runnable
		NewThread1 ob = new NewThread1();//object ob of class NewThread1
		Thread t1=new Thread(ob);
		t1.start();
		System.out.println(t1.isAlive());
		
		//extends Thread
		NewThread2 t2 = new NewThread2();
		t2.start();
		
		
		
		Thread t = Thread.currentThread();
		System.out.println("Current Thread "+t);

		try
		{
			for(int i=5;i>=1;i--)
				System.out.println(i+" MT");
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Main Interrupted"+e);
		}
		System.out.println("Main Thread Exiting");
	}
}
