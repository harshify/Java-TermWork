package HARSH40;

public class StaticEle 
{
		static int a = 6;
		static int b;
		static void calculation(int ele) 
		{
		System.out.println("element = " + ele);
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		}
		static {
		System.out.println("Static block initialized here.");
		b = a * 6;
		}
		public static void main(String[] args) 
		{
		calculation(29);
		System.out.println("*****************************************************************");
		System.out.println("Implemented By:Harsh Raj Mishra\tClass Roll No. 40\tCSE4(E)");
		System.out.println("*****************************************************************");
		}   
}
