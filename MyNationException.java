package HARSH40;
import java.util.Scanner;
class InvalidMessageException extends Exception{ 
	String s="";
InvalidMessageException (String e)
{
s=e;
}
public String toString()
{
return "error is here";
}
}
public class MyNationException {
public static void main(String[] args) {
// TODO Auto-generated method stub 
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string"); 
	String str=sc.next();
String s="JAIHIND";
try {
if(str.equalsIgnoreCase(s)!=true)
{
	throw new InvalidMessageException("not Jai Hind : you've entered" +str);
}
else {
	System.out.println("Jai Hind: Welcome to India");
}
}
catch(InvalidMessageException e)
{
	System.out.println(e);
} 
System.out.println("rest	");
}
}
