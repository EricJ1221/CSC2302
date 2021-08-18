//object, method and class practice 

public class TestCircle{
   public static void main(String[]args){
      
      //create a circle with a radius of 1
      Circle circle1 = new Circle();
      System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());
      
      //create a circle with a radius of 25
      Circle circle2 = new Circle(25);
      System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
      
      //create a circle with a radius of 125
      Circle circle3 = new Circle(125);
      System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3.getArea());
      
      //modify circle2's radius
      circle2.radius = 50; //or circle2.setRadius(50);
      System.out.println("The new radius of circle2 is " + circle2.radius);
   } 
}  
   class Circle{
      //the radius of the circle
      double radius = 1;
      
      //construct a circle object
      Circle(){
         
      }
      
      //construct a circle object where you can specify the radius
      Circle(double newRadius){
         radius = newRadius;
      }
      //return the area of the this circle
      double getArea(){
         return radius * radius * Math.PI;
      }
      //return the perimeter of the circle
      double getPerimeter(){
      return 2 * radius * Math.PI;
      }
      
      //set a new radius for this circle
      void setRadius(double newRadius){
         radius = newRadius;
      }

}