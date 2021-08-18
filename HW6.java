/******************************************************

name: Eric Oliver

name of file: HW6

**Description: This program contains my main method which contains an array of doors. Outside of my method I have an openDoor method which will print out how each different type of door opens.

*******************************************************/

public class HW6{
   public static void main(String[] args){
   //type, array name
   Door[] myDoors = new Door[4];
   
   myDoors[0] = new MetalDoor(4, 5, 2, "Stainless Steel"); //must pass string to new door
   
   myDoors[1] = new MetalDoor(1, 7, 3, "Cast Iron"); //myDoors[#] = new MetalDoor(pass all info in order, "steel or oak" depending on door class)
   
   myDoors[2] = new WoodDoor(8, 5, 2, "Oak");
   
   myDoors[3] = new WoodDoor(6, 5, 2, "Mahogany");
   
   openDoor(myDoors);
   
   //myDoor[0].toString();
      
   }
   public static void openDoor(Door[] myDoors){
      for(int index = 0; index < myDoors.length; index++){
         if(index < 2)
            System.out.println(((MetalDoor)myDoors[index]).howToOpen());
         if(index >= 2)
            System.out.println(((WoodDoor)myDoors[index]).howToOpen());
      }
   }
}