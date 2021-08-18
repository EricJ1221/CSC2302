//object, method and class practice 

public class Circletest{
   public static void main(String[]args){
      
      //create a circle with a radius of 1
      Circle circle1 = new Circle();
      
      Circle circle2 = new Circle();
      
      Circle circle3 = new Circle();
      
      double sum = 0;
      
      for(int i = 0; i<3; i++){
         System.out.println("The area of the circle of radius " + circle(i).radius + " is " + circle(i).getArea());
         sum += circle(i).getArea();
      }
      //Circle circle2
   } 
}  
   class Circle{
      //the radius of the circle
      double radius = 1.0;
      
      //construct a circle object
      Circle(){
         
      }
      //construct a circle object
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