/******************************************************

name: Eric Oliver

name of file: HW6

**Description: This program contains my WoodDoor class which is a child class of my parent class Doors. It also contains a toString method and a howToOpen method. 

*******************************************************/


//child class\subclass\derived class
class WoodDoor extends Door{              //"extends Door" allows the class MetalDoor to inherit the Door Class
   String typeOfWood;
   
   WoodDoor(int numWindows, int y, int x, String woodType){             //have to call the super in the constructor instead of in the class
      super(numWindows, y, x);
      this.typeOfWood = woodType;
   }
   @Override                              //@override is necessary so super.toString() doesnt call the parent toString, it will call the child toString
   public String toString(){              //don't needto pass parameters because the super will pull them directly from the parent and metal type is in the class parameters already
      return super.toString() + "\nThe type of wood is " + this.typeOfWood; //return the actual string not the method name
   }
   public String howToOpen(){
      return "\nThis door swings to the inside"; 
   }
}
