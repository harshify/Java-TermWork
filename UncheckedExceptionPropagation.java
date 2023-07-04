package HARSH40;
public class UncheckedExceptionPropagation {
void c()
{
System.out.println("Uncaught exception in method c()");
int data=50/0;
}
void b()
{
System.out.println("Uncaught exception in method b()"); c();
}
void a()
{
System.out.println("Uncaught exception in method a()"); b();
}

public static void main(String[] args) {
// TODO Auto-generated method stub 
	System.out.println("Demonstrtating the Uncaught Exception ");
UncheckedExceptionPropagation e= new UncheckedExceptionPropagation();
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
