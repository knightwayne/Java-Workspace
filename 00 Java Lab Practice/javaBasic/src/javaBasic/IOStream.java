package javaBasic;
import java.io.*;
import java.util.Scanner;
public class IOStream 
{
public static void main(String args[]) throws IOException
{
	String str;
	/*
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	do
	{
		str=br.readLine();
	}while(!str.equals("stops"));
	Scanner sc = new Scanner(System.in);
	str = sc.nextLine();
	PrintWriter pw = new PrintWriter(System.out, true);
	pw.println(str);*/
	int i = 12;
	Double vald = Double.valueOf(98.95);
	Integer b = Integer.valueOf(i);
	System.out.println(b+" "+vald);

}
}
