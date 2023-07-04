package HARSH40;
class Animal
{
Animal(){System.out.println("Animal is born");
}
void walk(){System.out.println("Animal is walking");}

}
class Tiger extends Animal{ Tiger(){
super();
System.out.println("Tiger is born");
}
void walk(){System.out.println("Walking Tiger");}
void run(){System.out.println("Tiger is running");}
void work(){
super.walk();
run();

}
}
public class SuperKeyword {

public static void main(String[] args) { Tiger t=new Tiger();
t.walk();
t.work();
System.out.println("*****************************************************************");
System.out.println("Implemented By:Harsh Raj Mishra\tClass Roll No. 40\tCSE4(E)");
System.out.println("*****************************************************************");
}

}
