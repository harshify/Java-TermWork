package HARSH40;
import java.util.Scanner;
public class CarSurvey {
public static void main(String[] args) {
// TODO Auto-generated method stub
int choice;
int survey[][]= new int [4][4];
Scanner sc= new Scanner(System.in);
for(int i=0;i<4;i++)
{
for(int j=0;j<4;j++)
{
survey[i][j]=0;
}
}
int cityCode;
int carCode;
do {
System.out.println(" ......... ........ MAIN MENU..........................");
System.out.println(" Enter [0] for Delhi");
System.out.println(" Enter [1] for Mumbai");
System.out.println(" Enter [2] for Kolkata");
System.out.println(" Enter [3] for Chennai\n");
System.out.println(" Enter [0] for Zen-Astelo");
System.out.println(" Enter [1] for K-10");
System.out.println(" Enter [2] for Wagnor");
System.out.println(" Enter [3] for SX-4\n");
System.out.print(" Enter city code: ");
cityCode=sc.nextInt();
System.out.print(" Enter car code: ");
carCode=sc.nextInt();
survey[cityCode][carCode]++;
System.out.println(" Enter 0 to Exit \n Enter 1 to continue");
choice=sc.nextInt();
} while(choice==1);
System.out.println("\t K-10\t Zen Astelo\t Wagnor\tSX-4");
for(int i=0;i<4;i++)
{
if(i==0)
{
System.out.print("Delhi ");
}
else if(i==1)
{
System.out.print("Mumbai ");
}
else if(i==2)
{
System.out.print("Kolkata");
}
else if(i==3)
{
System.out.print("Chennai");
}
for(int j=0;j<4;j++)
{
System.out.print(" "+survey[i][j]+"\t");
}
System.out.println();
}
System.out.println("*****************************************************************");
System.out.println("Implemented By:Harsh Raj Mishra\tClass Roll No. 40\tCSE4(E)");
System.out.println("*****************************************************************");
}
}