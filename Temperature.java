package HARSH40;
import java.util.Scanner;
public
class Temperature
{

public
static void main(String[] args)
{

// TODO Auto-generated method stub 
Scanner sc = new Scanner(System.in);
int days,day = 0,minday=0;
int min=100,max=0,minimum = 0,maximum = 0;
int city[][] = new int[11][6];
String str[]=new String[6];

for (int i = 1; i < 11; i++)
{
for (int j = 1; j < 6; j++)
{
if (j == 1)
{
System.out.print("Enter the temperature in Delhi on day " + i +" ");

days = sc.nextInt();

city[i][j] = days;
str[j]="Delhi";
}
if (j == 2)
{
System.out.print("Enter the temperature in Mumbai on day " + i + " ");

days = sc.nextInt();

city[i][j] = days;
str[j]="Mumbai";
}
if (j == 3)
{
System.out.print("Enter the temperature in Kolkata on day " + i + " ");

days = sc.nextInt();
city[i][j] = days; str[j]="Kolkata";
}
if (j == 4)
{
System.out.print("Enter the temperature in Chennai on day " + i
+ " ");

days = sc.nextInt();

city[i][j] = days; str[j]="Chennai";
}

if (j == 5)
{

System.out.print("Enter the temperature in Dehradun on day " + i
+ " ");

days = sc.nextInt();
 
city[i][j] = days; str[j]="Dehradun";

break;
}
}
}

System.out.println(" Day \t	Delhi\t	Mumbai\t	Kolkata \t Chennai \t	Dehradun");

for (int i = 1; i < 11; i++)

{

System.out.print(" " + i + " ");

for (int j = 1; j < 6; j++)

{
System.out.print("	\t" + city[i][j]);
if(city[i][j]<min) {
min=city[i][j]; minday=j; minimum=i;
}
if(city[i][j]>max)
{
max=city[i][j]; day=j; maximum=i;
}
}

System.out.println(" ");
}
System.out.println("Maximum temperature is "+ max+ " on day "+ maximum + " in "+str[day]);
System.out.println("Minimum temperature is "+ min+ " on day "+ minimum + " in "+str[minday]);
System.out.println("*****************************************************************");
System.out.println("Implemented By:Harsh Raj Mishra\tClass Roll No. 40\tCSE4(E)");
System.out.println("*****************************************************************");
}
}
