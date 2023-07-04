package HARSH40;
import java.util.Scanner;
public class ReverseString
{
void revStr(String str)
{
String words[] = str.split(" "); String reversed = "";
for (int i = 0; i < words.length; i++)
{
String word = words[i]; String revWord = "";
for (int j = word.length() - 1; j >= 0; j--)
{
revWord = revWord + word.charAt(j);
}
reversed = reversed + revWord + " ";
}
System.out.println("Original String is: " + str); System.out.println("Reversed String is: " + reversed);
}
public static void main(String[] args)
{
// TODO Auto-generated method stub 
	ReverseString ob = new ReverseString(); 
	System.out.println("Enter a string"); 
	Scanner sc=new Scanner(System.in); 
	String rev = sc.nextLine(); 
	ob.revStr(rev);
}
}
