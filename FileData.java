package HARSH40;
import java.io.*;
public class FileData {
	public static void main(String[] args) {
		try
		{
		FileInputStream r=new FileInputStream("C:\\Users\\harsh\\Desktop\\Sample.txt");
		FileOutputStream w=new FileOutputStream("C:\\Users\\harsh\\Desktop\\Sonali.txt");
		
		int i;
		while((i=r.read())!=1)
		{
			w.write((char)i);
		}
		System.out.println("Copied....");
		}
		catch(IOException e)
		{
			System.out.println("Exception Handled");
		}
}
}