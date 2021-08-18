//class and object practice

public class HatExample{
   public static void main(String []args){
      
      Hats hat1 = new Hats(); // hat1 is an object (instantiation), it is the actual variable that is the data type of our custom class
      
      hat1.color = "Red";
      hat1.size = 7;
      hat1.style = "Cowboy";
      hat1.logo = true ;
      
      //hat1.Print();
      
      System.out.print(hat1.toString());
      
   }
}

class Hats{ // Hats is the class, the blueprint
   
   String color; // we use the . function to access the member data
   int size;  
   String style;
   boolean logo;
   
//visibility, return type, Method name
   public void Print(){
   
   //System.out.println("Color: " + color + " Size: " + size + " style: "+ style + " logo: " + logo); 
   //this method will auto populate for the objects
   System.out.println(toString());
   }
   
   public String toString(){
   
   return "Color: " + color + " Size: " + size + " style: "+ style + " logo: " + logo;
   }
}