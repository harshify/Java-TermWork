package HARSH40;
import java.util.Scanner;
public class SumRowColumn 
{
	public static void main(String[] args)
	{
		int newSale;
		int sum=0,column=0,total_col=0;
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		int sales[][]=new int[5][5]; int cols=sales[0].length; for(int i=1;i<=4;i++) 
		{
			for(int j=1;j<=4;j++)
			{
				System.out.print(" Enter the sales for Salesperson "+i+" in quarter "+j+": ");
				newSale=sc.nextInt(); sales[i][j]=newSale;
			}
		}
		System.out.println ("\t	Quarter 1	Quarter 2	Quarter 3	Quarter 4 Total");
		for(int i=1;i<=4;i++)
		{
			column=0;
			if(i==1)
			{
				System.out.print("Salesman 1");
			}
			else if(i==2)
			{
				System.out.print("Salesman 2");
			}
			else if(i==3)
			{	
				System.out.print("Salesman 3");
			}
			else if(i==4)
			{
				System.out.print("Salesman 4");
			}
			for(int j=1;j<=4;j++)
			{
				System.out.print("\t "+sales[i][j]+"\t");
				column+=sales[i][j];
			}
			System.out.print("\t "+column); System.out.println("");
		}
		System.out.print("Total\t"); sum=0;
		for(int i=1;i<=cols-1;i++)
		{
			for( int j=1;j<=4;j++)
			{
				sum=sum+sales[j][i];
			}
			total_col+=sum; arr[i]=sum; sum=0;
		}
		for(int i=1;i<=5;i++)
		{	if(i!=5) {
			System.out.print("\t "+arr[i]+"\t");
		}	
		else {
		}
		}
		System.out.println("\t "+total_col);
		System.out.println("*****************************************************************");
		System.out.println("Implemented By:Harsh Raj Mishra\tClass Roll No. 40\tCSE4(E)");
		System.out.println("*****************************************************************");
	}
	}