import java.io.*;
public class IOmain3 {
public static void main(String args[])
{
	try {
		Reader r = new InputStreamReader(System.in);
		BufferedReader input = new BufferedReader(r);
		String str=input.readLine();
		System.out.println(str);
		
		int n=Integer.parseInt(input.readLine());
		int i=0;
		int[] arr=new int[n];
		System.out.println(n);
		for(i=0;i<n;i++)
		{
			arr[i]=Integer.parseInt(input.readLine());
			//arr[i]=j;	
		}
		
		Writer w = new OutputStreamWriter(System.out);
		BufferedWriter output = new BufferedWriter(w);
		output.write("goddamn it, finally reached here");
		
		for(i=0;i<n;i++)
		{
			//output.write((int)arr[i]);
			System.out.println(i+" "+ arr[i]);
		}
		output.flush();
		output.close();
	}
	catch(Exception e) {
		
	}
}
}
