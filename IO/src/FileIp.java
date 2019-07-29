import java.io.*;

public class FileIp
{
	public static void main(String args[])
	{
		try{
			FileInputStream fin= new FileInputStream("C:\\\\Users\\\\Arnav\\\\Desktop\\\\Work_Space\\\\Java\\\\javafile.txt");
		   /*String s="We will, we will rock you.";
		   byte b[]=s.getBytes;
		   fout.write(b);
		   fout.close();*/
			int i=0;
			while((i=fin.read())!=-1)
			{
				System.out.print((char)i);
			}
			System.out.print("\n");
			fin.close();
		   System.out.println("Done!");
		   }
		   catch(Exception e)
		   {
		   System.out.println(e);
		   }
	}
}