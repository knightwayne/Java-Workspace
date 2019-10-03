//import java.util.*;
import java.io.*;
public class IOmain2 {
public static void main(String args[])
{
	try {
		Reader input = new InputStreamReader(System.in);
		//String str;
		int i=0;
		char k='.';
		while((i=input.read())!=((int)k))
		System.out.println(i+" : user input "+(char)i);
		//input.flush();
		
		Writer output = new OutputStreamWriter(System.out);
		output.write("goddamn it, finally reached here");
		output.flush();
		output.close();
	}
	catch(Exception e) {
		
	}
}
}
