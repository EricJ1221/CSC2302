/******************************************************

name: Eric Oliver

name of file: HW6

**Description: This program contains 

*******************************************************/

public class HW6test{
   public static void main(String[] args){
   //type, array name
   Door[] myDoors = new Door[4];
   
   myDoors[0] = new MetalDoor(4, 5, 2, "Stainless Steel"); //must pass string to new door
   
   myDoors[1] = new MetalDoor(1, 7, 3, "Cast Iron"); //myDoors[#] = new MetalDoor(pass all info in order, "steel or oak" depending on door class)
   
   myDoors[2] = new WoodDoor(8, 5, 2, "Oak");
   
   myDoors[3] = new WoodDoor(6, 5, 2, "Mahogany");
   
   openDoor(myDoors);
      
   }
   public static void openDoor(Door[] myDoors){
      for(int index = 0; index < myDoors.length; index++){
         if(index < 2)
            System.out.println(((MetalDoor)myDoors[index]).howToOpen());
         if(index >= 2)
            System.out.println(((WoodDoor)myDoors[index]).howToOpen());
      }
   }

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
      this.area = y * x;
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
   public String toString(){ //unsure about what im passing
      return "\nThe number of windows is " + this.numWindows + "\n the height of the door is " + this.height + "\n the width of the door is " + this.width + "\n the area of the door is " + this.area;
   }
}

//child class\subclass\derived class
class MetalDoor extends Door{ //"extends Door" allows the class MetalDoor to inherit the Door Class
   String typeOfMetal;
   
   MetalDoor(int numWindows, int y, int x, String metalType){
      super(numWindows, y, x);
      this.typeOfMetal = metalType;
   }
   @Override
   public String toString(){ //don't needto pass parameters because the super will pull them directly from the parent and metal type is in the class parameters already
      return super.toString() + "\nThe type of metal is " + metalType; //super is going to call my tostring method in line 61
   }
   
   public String howToOpen(){
      return "This door slides up"; 
   }
}

//child class\subclass\derived class
class WoodDoor extends Door{ //"extends Door" allows the class MetalDoor to inherit the Door Class
   String typeOfWood;
   
   WoodDoor(int numWindows, int y, int x, String woodType){ //have to call the super in the constructor instead of in the class
      super(numWindows, y, x);
      this.typeOfWood = woodType;
   }
   @Override // is necessary so super.toString() doesnt call the parent toString, it will call the child toString
   public String toString(){ //String woodType, int numWindows, int y, int x
      return super.toString() + "\nThe type of wood is " + woodType; //return the actual string not the method name
   }
   public String howToOpen(){
      return "This door swings to the inside"; 
   }
}
}