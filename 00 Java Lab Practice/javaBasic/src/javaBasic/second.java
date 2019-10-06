package javaBasic;
class _Box
{
	int length;
	int width;
	int height;
	_Box(int l, int w, int h)
	{
		length=l;
		width=w;
		height=h;
		
	}
	_Box(int a)
	{
		length=a;
		width=a;
		height=a;
	}
	int volume()
	{
		return length*width*height;
	}
	
}
public class second
{
public static void main(String args[])
{
	_Box box1=new _Box(10, 15, 20);
	_Box box2=new _Box(12);
	System.out.println("Volume of box1 is "+box1.volume());
	System.out.println("Volume of box2 is "+box2.volume());
}
}
