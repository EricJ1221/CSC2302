/******************************************************

name: Eric Oliver

name of file: HW4

**Description: This program contains my main method and will call upon my constructors from my Triangle class to create my array of Triangles. 
After populating the array of triangles I call upon the printArea method to print out the individual triangles area.
*******************************************************/

public class HW4{
   public static void main(String []args){
   
   Triangle[] triangleArr = new Triangle[4];
   
   triangleArr[0] = new Triangle(5.5 , 6.0);
   
   triangleArr[1] = new Triangle(4.0, 5.0);
   
   triangleArr[2] = new Triangle(3.0, 2.0);
   
   triangleArr[3] = new Triangle(2.0, 6.0);
   
   System.out.println("The number of triangles is: " + triangleArr[3].getNumTriangles());
   
   Triangle.printArea(triangleArr);   
   
   }
}