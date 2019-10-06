package javaBasic;
class A
{
	int i,j;
	A(int a, int b) 
	{
		i=a;
		j=b;
	}
	void Show()
	{
		System.out.println(i+" "+j);
	}
}
class B extends A
{
	int k;
	B(int i,int j,int c)
	{
		super(i,j);
		k=c;
	}
	void Show()
	{
		//super.Show();
		System.out.println(i+" "+j+" "+k);
	}
	
}
public class inheritance 
{
public static void main(String args[])
{
	A a = new A(2,5);
	B b = new B(9,10,12);
	a.Show();
	b.Show();
	/*A obj;
	obj=a;*/
}
}
