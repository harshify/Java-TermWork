package HARSH40;
abstract class Shape{
abstract void draw();
abstract void erase();
}
class Circle extends Shape{
void draw() {
System.out.println("This is Shape Class");
}
void erase() {
System.out.println("Erasing Shape");
}
}
class Triangle extends Shape{
void draw() {
System.out.println("These three sides make a Triangle ");
}
void erase() {
System.out.println("The triangle is gone");
}
}
class rectangle extends Shape{
void draw() {
System.out.println("A shape called Rectangle");
}
void erase() {
System.out.println("Rectangle is Erased");
}
}
public class Ques15 {

public static void main(String[] args) { Shape c=new Circle();
Shape t=new Triangle(); Shape r=new rectangle(); c.draw();
t.draw();
r.draw(); System.out.println("\nErasing:::"); r.erase();
t.erase();
c.erase();
System.out.println("*****************************************************************");
System.out.println("Implemented By:Harsh Raj Mishra\tClass Roll No. 40\tCSE4(E)");
System.out.println("*****************************************************************");
}
}
