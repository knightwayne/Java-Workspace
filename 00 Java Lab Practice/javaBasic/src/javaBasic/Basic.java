package javaBasic;

class Box
{
	double length;
	double width;
	double height;
	byte b = (byte) 2200;
	int a = b;
	int c = 55;
	byte d = (byte) c;
	Box(double length, double width, double height)
	{
		this.length=length;
		this.width=width;
		this.height=height;
	}
	double volume()
	{
		return length*width*height;
	}
	/*void setDim(int l, int w, int h)
	{
	    length=l;
		width=w;
		height=h;
	}*/
}
public class Basic
{
public static void main(String argd[])
{
	Box box1=new Box(100,20,15);
	//Box box2=new Box();
	//box1.length=10;
	//box1.width=20;
	//box1.height=5;
	//box1.setDim(10, 20, 15);
	System.out.println("Length of box1 is "+box1.length);
	System.out.println("Volume of box1 is "+box1.volume());
}
}
