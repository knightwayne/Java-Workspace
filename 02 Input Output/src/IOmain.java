//import java.util.*;
import java.io.*;
public class IOmain {
	//byte based io input-stream and output-stream
public static void main(String args[])
{
	try {
		InputStream input = new FileInputStream("C:\\\\Users\\\\Arnav\\\\Desktop\\\\Work_Space\\\\Java\\\\file1.txt");
		int i;
		while((i=input.read())!=-1)
		{
			System.out.print((char)i);
		}
		input.close();
		
		OutputStream output = new FileOutputStream("C:\\Users\\Arnav\\Desktop\\Work_Space\\Java\\fileio.txt");
		output.write("10 11".getBytes());
		output.close();
	}
	catch(Exception e) {
		
	}
}
}
