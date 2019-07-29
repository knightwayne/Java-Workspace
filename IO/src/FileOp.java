import java.io.*;

public class FileOp
{
	public static void main(String args[])
	{
		try{
			FileOutputStream fout= new FileOutputStream("C:\\Users\\Arnav\\Desktop\\Work_Space\\Java\\javafile.txt");
		   String s="We will, we will rock you.";
		   byte b[]=s.getBytes();
		   fout.write(b);
		   fout.close();
		   System.out.println("Done!");
		   }
		   catch(Exception e)
		   {
		   System.out.println(e);
		   }
	}
}