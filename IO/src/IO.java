//import java.util.*;
/*public class IO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int i=System.in.read();
			System.out.println("input = " + i);
			}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}*/
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException; 
public class IO {  
    public static void main(String[] args) throws IOException {  
        FileOutputStream file = new FileOutputStream("C:\\Users\\Arnav\\Desktop\\Work_Space\\Java\\fileio.txt");  
        DataOutputStream data = new DataOutputStream(file);  
        //int i=1175;
        int[] b = {7,11,124,7008};
        int k=b.length;
        int i=0;
        //System.out.println(k);
        while(i<k)
        {
        	//data.writeChars(b[i]+" ");
        	//data.writeBytes(b[i]+" ");
        	data.writeBytes("alpha beta gamma ");
        	//data.writeByte(75);
        	i++;
        }
        data.flush();  
        data.close();  
        System.out.println("Succcess...");  
    }  
}  
