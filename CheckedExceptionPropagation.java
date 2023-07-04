package HARSH40;
import java.io.IOException;
public class CheckedExceptionPropagation {
void c() throws IOException
{
System.out.println("Uncaught exception in method c()"); 
IOException e=new IOException("Device IO Error"); throw e;
}
void b() throws IOException
{
System.out.println("Uncaught exception in method b()"); c();
}
void a( ) throws IOException
{
System.out.println("Uncaught exception in method a()"); b();
}

public static void main(String[] args) {
// TODO Auto-generated method stub 
	System.out.println("Demonstrtating the Caught Exception "); 
	CheckedExceptionPropagation e= new CheckedExceptionPropagation(); 
	try {
		e.a();
	}	
catch(Exception err)
{
System.out.println("Exception handled by main "); System.out.println(err);
}
System.out.println("End of program	");
System.out.println("*****************************************************************");
System.out.println("Implemented By:Harsh Raj Mishra\tClass Roll No. 40\tCSE4(E)");
System.out.println("*****************************************************************");
}
}
