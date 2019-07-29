import java.io.SequenceInputStream;
import java.io.*;

public class SeqInpStream {
	public static void main(String args[])
	{
		try {
			FileInputStream f1 = new FileInputStream("C:\\Users\\Arnav\\Desktop\\Work_Space\\Java\\file1.txt");
			FileInputStream f2 = new FileInputStream("C:\\Users\\Arnav\\Desktop\\Work_Space\\Java\\file2.txt");
			FileOutputStream fout = new FileOutputStream("C:\\Users\\Arnav\\Desktop\\Work_Space\\Java\\file3.txt");
			SequenceInputStream sis = new SequenceInputStream(f1, f2);
			int i=0;
			while((i=sis.read())!=-1)
			{
				System.out.print(i+" ");
				fout.write(i);
			}
			sis.close();
			fout.close();
			f2.close();
			f1.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
