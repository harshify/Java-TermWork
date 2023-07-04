package HARSH40;
import java.util.Scanner;
class TelCall{
String phno; String name; int n; double amt;
TelCall(String x,String y, int z){ phno=x;
name=y; n=z;
}
void compute()
{
if(n<=100)
{
amt=500;
}
else if(n<=200)
{
amt=(n-100)*1.00 + 500;
}
else if(n<=300)
{
	amt=100*1.0 + (n-200)*1.20 + 500;
}
else {
amt= 100*1.0 + 100*1.20 + (n-300)*1.50 + 500;
}
}
void display()
{
System.out.println(" Name: "+ name+ "\n Phone no: " + phno + "\n No of Calls: "+ n + "\n Amount: "+ amt);
}
}
public class BillDemo {

public static void main(String[] args) {
// TODO Auto-generated method stub 
	Scanner sc=new Scanner(System.in); 
	System.out.print("Enter phone number: "); 
	String a=sc.next(); 
	System.out.print("Enter name: ");
String b=sc.next(); System.out.print("Enter no of calls: "); int c=sc.nextInt();
TelCall ob1=new TelCall(a,b,c); ob1.compute();
ob1.display();
System.out.println("*****************************************************************");
System.out.println("Implemented By:Harsh Raj Mishra\tClass Roll No. 40\tCSE4(E)");
System.out.println("*****************************************************************");
}
}
