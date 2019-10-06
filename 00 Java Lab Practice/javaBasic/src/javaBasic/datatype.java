package javaBasic;
import java.util.*;


public class datatype 
{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	int a = sc.nextInt();
	int b[] = new int[a];
	for(int i=0;i<a;i++)
	{
		b[i] = sc.nextInt();
	}
	System.out.println(str);
	for(int i=0;i<a;i++)
	{
		System.out.println(b[i]);
	}
	StringBuffer str1 = new StringBuffer("Hello");
	recstr(str1);
}
static void recstr(StringBuffer str)
{
	int la = str.length();
	if(la==1)
		System.out.println(str.charAt(la-1));
	else
	{
		System.out.print(str.charAt(la-1));
		str.setLength(la-1);
		recstr(str);
	}
}
}
