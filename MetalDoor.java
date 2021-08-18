/******************************************************

name: Eric Oliver

name of file: HW6

**Description: This program contains my MetalDoor class which is a child class of my parent class Doors. It also contains a toString method and a howToOpen method. 

*******************************************************/


//child class\subclass\derived class
class MetalDoor extends Door{       //"extends Door" allows the class MetalDoor to inherit the Door Class
   String typeOfMetal;
   
   MetalDoor(int numWindows, int y, int x, String metalType){
      super(numWindows, y, x);
      this.typeOfMetal = metalType;
   }
   @Override                     //@override is necessary so super.toString() doesnt call the parent toString, it will call the child toString
   public String toString(){     //don't needto pass parameters because the super will pull them directly from the parent and metal type is in the class parameters already
      return super.toString() + "\nThe type of metal is " + this.typeOfMetal; //super is going to call my tostring method in line 61
   }
   public String howToOpen(){
      return "\nThis door slides up"; 
   }
}