package HARSH40;
import java.util.Scanner;
class Info
{
String name; String accNo; String type; double bal;
Info(String name,String accNo,String type,double bal)
{
this.name=name; this.accNo=accNo; this.type=type; this.bal=bal;
}
void deposit(int val)
{
bal=bal+val;
System.out.println("Current amount: "+bal);
}
void withdraw(int val)
{
if(val>bal)
{
}
else {
 
System.out.println("Requested amount is greater than the balance");

bal=bal-val;
System.out.println("Current amount: "+bal);
 

}
}
void display()
{
 
System.out.println("Name: "+name); System.out.println("Amount: "+ bal);
}

}
public class BankAccounts {

public static void main(String[] args) {
// TODO Auto-generated method stub 
	Scanner sc=new Scanner(System.in); 
	System.out.println("Enter your name : "); 
	String name=sc.next();
System.out.println("Enter your account number : "); 
String acc=sc.next();
System.out.println("Enter your account type : ");
String type=sc.next();
System.out.println("Enter your account balance : ");
double bal=sc.nextInt();
int choice,amt;
Info obj=new Info(name,acc,type,bal);

do {
 
System.out.println("Press 1 to deposit the amount"); System.out.println("Press 2 to withdraw "); System.out.println("Press 3 to display name and balance"); System.out.println("Press 0 to exit"); choice=sc.nextInt();
if(choice==1)
{
 
System.out.print("Enter the amount to deposit"); amt=sc.nextInt();
obj.deposit(amt);

}
else if(choice==2)
{
System.out.print("Enter the amount to wihtdraw"); amt=sc.nextInt();
obj.withdraw(amt);
}
else if(choice==3)
{
obj.display();
}

}while(choice!=0);
System.out.println("*****************************************************************");
System.out.println("Implemented By:Harsh Raj Mishra\tClass Roll No. 40\tCSE4(E)");
System.out.println("*****************************************************************");
}

}
