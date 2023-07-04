package HARSH40;

public class SumOfCmdArguments {

	public static void main(String[] args) {
// TODO Auto-generated method stub
		int sum = 0;

		for (String s : args)

		{
			try {

				sum += Integer.parseInt(s);
				System.out.println("Number argument:" + s);
			}

			catch (NumberFormatException err)

			{

				System.out.println("Not a Number argument:" + s);

			}

		}

		System.out.println("Sum of Integer arguments:" + sum);
		System.out.println("*****************************************************************");
		System.out.println("Implemented By:Harsh Raj Mishra\tClass Roll No. 40\tCSE4(E)");
		System.out.println("*****************************************************************");
	}

}
