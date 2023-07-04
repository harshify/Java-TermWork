package HARSH40;
import java.util.Scanner;
public class VotesWinner 
{
	public static void main(String[] args) { 
		String[] candidates=new String[5]; 
		Scanner sc=new Scanner(System.in); 
		int[] votes = new int[5];
		float[] voteper=new float[5]; 
		int max,sum=0;
		for(int i=0;i<5;i++) {
			System.out.println("Enter candidates name:");

			candidates[i]=sc.next(); 
			System.out.println("Enter no. of votes:"); 
			votes[i]=sc.nextInt();
			sum+=votes[i];
		}
		max=0;
 for(int i=0;i<5;i++) 
{ voteper[i]=(votes[i]/(float)sum)*100; if(voteper[i]>voteper[max]) {
max=i;
 


System.out.println("Candidate"+"\t"+"Votes Received"+"\t"+"TotalVotes"+"");
 
}
}

for(int i=0;i<5;i++) {
 

System.out.println(candidates[i]+"\t\t"+votes[i]+"\t\t"+voteper[i]+" ");

}
System.out.println("The Winner of the Election is "+ candidates[max]);
System.out.println("*****************************************************************");
System.out.println("Implemented By:Harsh Raj Mishra\tClass Roll No. 40\tCSE4(E)");
System.out.println("*****************************************************************");

}

}

