package HARSH40;
class InfoStu{
int rollno;
 
String Name; String section; int Attendence;
InfoStu(int rollno,String Name,String section,int Attendence){
this.rollno=rollno; this.Name=Name; this.section=section; this.Attendence=Attendence;
}
void display() {
System.out.println(rollno+"\t"+Name+"\t"+section+"\t"+Attendence);
}
}
public class ArrayOfObj {

public static void main(String[] args) 
{
	InfoStu[] s=new InfoStu[5];

s[0]=new InfoStu(40,"Harsh","E",85);
s[1]=new InfoStu(66,"Shubhi","E",80);
s[2]=new InfoStu(13,"Arpit","G",79);
s[3]=new InfoStu(21,"Abhay","S",88);
s[4]=new InfoStu(70,"Sonali","E",95);

System.out.println("RollNo"+"\t"+"Name"+"\t"+"Section"+"\t"+"Attendence");
for(int i=0;i<5;i++) 
{ 
	s[i].display();
}
System.out.println("*****************************************************************");
System.out.println("Implemented By:Harsh Raj Mishra\tClass Roll No. 40\tCSE4(E)");
System.out.println("*****************************************************************");
}

}
