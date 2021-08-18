/******************************************************

name: Eric Oliver

name of file: HW4

**Description: This program contains my triangle constructors, getters, setters and other methods to achieve the goals of the homework assignment.
 
*******************************************************/

class Triangle{

   private double base;
   private double height;
   private static int numTriangles;
   
   Triangle(){
      this(4.0,6.0);
   }
   
   Triangle(double b , double h){
      this.base = b;
      this.height = h;
      numTriangles++;
   }
   
   public double getBase(){
      return base;
   }
   public void setBase(double b){
      this.base = b;
   }
   public double getHeight(){
      return height;
   }
   public void setHeight(double h){
      this.height = h;
   }
   public double getArea(){
      return ((getBase()*getHeight())/2);
   }
   public static void printArea(Triangle[] triangleArr){
      for(int index = 0; index < triangleArr.length; index++){
         System.out.println("The area of Triangle " + index + " is " + triangleArr[index].getArea());
      }
   }
   public int getNumTriangles(){
      return numTriangles;
   }
      
}
