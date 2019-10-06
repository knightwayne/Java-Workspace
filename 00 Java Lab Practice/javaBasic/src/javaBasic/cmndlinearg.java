package javaBasic;

public class cmndlinearg 
{
public static void main(String args[])
{
	
	for(int i=0;i<args.length;i++)
	{
		System.out.println(args[i]);
	}
	   Character c = new Character('v');
	   Character d = 'W';
	   char e = c.charValue();
	   char f = d;
	   System.out.println(c+" "+d);
	   System.out.println(e+" "+f); 
	   Integer iOb = 123;
	   int i = iOb;
	   int j = iOb.intValue();
	   float k = iOb.floatValue();
	   System.out.println(i+" "+j+" "+k);
	   System.out.println(Character.isDigit(c));
	   System.out.println(Character.isDigit(d));
	   System.out.println(Character.isUpperCase(d));
	   //System.out.println(Character.isDigit('v'));
	   //System.out.println(Character.isDigit('W'));
	   String str1 = "String";
	   System.out.println(str1);
	   
}
}
