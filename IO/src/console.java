import java.io.*;
public class console {
public static void main(String args[])
{
	try {
		Console c = System.console();
		String str= c.readLine();
		System.out.println("You typed "+str);
	}
	catch(Exception e){
		
	}
}
}
