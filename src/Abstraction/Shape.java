package Abstraction;

public abstract class Shape {
  //Abstract method
 abstract void draw();

 //Concrete method
 public void move() {
   System.out.println("moving");
 }

}
