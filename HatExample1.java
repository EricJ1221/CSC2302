//class and object practice

public class HatExample1{
   public static void main(String []args){
      
      Hats hat1 = new Hats(); // hat1 is an object (instantiation), it is the actual variable that is the data type of our custom class
      
      hat1.color = "Red";
      hat1.size = 6;
      hat1.style = "Cowboy";
      hat1.logo = true ;
      
      System.out.println(hat1.ConvertSize());
      
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
   
   public String ConvertSize(){
   
      if(size < 3)
         return "small";
      else if(size < 7)
         return "medium";
      else
         return "large";
   }
}