package HARSH40;
import java.util.Scanner;
public class Duplicate 
{
public static int countSubstring(String a,String b) {
if(a.isEmpty()|| b.isEmpty())
{
return 0;
}
int pos=0;
int count=0;
int n=b.length();
while ((pos=a.indexOf(b,pos))!=-1) { pos=pos+n;
count++;
}
return count;
}
public static void main(String[] args) {
// TODO Auto-generated method stub 
	Scanner sc=new Scanner(System.in); 
	System.out.println("Enter the string: "); 
	String one=sc.nextLine();
System.out.println("\nEnter the substring to be searched: "); 
String two=sc.nextLine();
int count=countSubstring(one,two);
System.out.println("\n"+two + "' has occured " + count + " times in '"
+ one + "'");
System.out.println("*****************************************************************");
System.out.println("Implemented By:Harsh Raj Mishra\tClass Roll No. 40\tCSE4(E)");
System.out.println("*****************************************************************");
}
}
