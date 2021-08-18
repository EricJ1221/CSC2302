/******************************************************

name: Eric Oliver

name of file: HW6

**Description: This program contains my Door class which contains my member data, a default constructor, an overloaded constructor, and methods. 

*******************************************************/


class Door{ //parent class\super class\base class

   private int numOfWindows;
   private int height;
   private int width;
   private int area;
   
   Door(){ //this is the default constructor, it has no parameters passed to it
   }
   
   Door(int numWindows, int y, int x){
      this.numOfWindows = numWindows;
      this.height = y;
      this.width = x;
      this.area = this.height * this.width;
   }
   
   public double getNumOfWindows(){
      return numOfWindows;
   }
   public double getHeight(){
      return height;
   }
   public double getWidth(){
      return width;
   }
   public double getArea(){
      return (getHeight()*getWidth());
   }
   public String toString(){ 
      return "\nThe number of windows is " + this.numOfWindows + "\n the height of the door is " + this.height + "\n the width of the door is " + this.width + "\n the area of the door is " + this.area;
   }
}
