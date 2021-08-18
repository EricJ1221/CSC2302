//class and object practice

//added in getters and setters
//began working on constructors

public class HatExample2{
   public static void main(String []args){
      
      Hats hat1 = new Hats("green" , 6, "cowboy", false); // hat1 is an object (instantiation), it is the actual variable that is the data type of our custom class
      //when creating the object above it will call on the first constructor because we passed it variables
      hat1.Print();
      
      System.out.println(hat1.numHats);
      
      hat1.setColor("purple");
      
      hat1.Print();
      
      System.out.println(hat1.numHats);
      
      Hats hat2 = new Hats();
      
      //this object will call on the constructor that does not require variables to be passed
      hat2.Print();
      
      System.out.println(hat2.numHats);
      
      //hat1.Print();
      /*hat1.setColor("Red");
      hat1.setSize(5);
      hat1.setStyle("Cowboy");
      hat1.setLogo(true) ;*/
      
      //System.out.println(hat1.toString());
      
      
      //testing the overloaded method
      /*printVal(10);
      printVal("hello");
      printVal(12);*/
   }

//example of an overloaded method
//To overload we name the methods after each other and let the compiler sort it out
   /*public static void printVal(int a){
      System.out.println(a);
   }
   public static void prtinVal(String a){
      System.out.println(a);
   }
   */
}

class Hats{ // Hats is the class, the blueprint
   
   private String color; // we use the . function to access the member data
   private int size;  
   private String style;
   private boolean logo;
   public static int numHats;
   public static final int MAX_SIZE = 10;
   
   //method with the exact same name as the class
   //creating a constructor with set default values
   Hats(){
      /*this.color = "brown";
      this.size = 1;
      this.style = "plain";
      this.logo = false;*/
      
      this("brown", 1, "plain", false);
   }
   
   //created a constructor with parameters that can be passed through at object creation
   Hats(String c, int sd, String se, boolean sk){ //
      this.color = c;
      this.size = sd;
      this.style = se;
      this.logo = sk;
      numHats++;
   
   }
   
   public void setColor(String c){
      this.color = c;
   }
   public String getColor(){
     return color;
   }
     
   public void setSize(int d){
      if( d >= 1 && d <= 10) //added in to make sure we don't get an integer out of the range we desire
      size = d;
   }
   public int getSize(){
      return size;
   }
   
   public void setStyle(String e){
      style = e;
   }
   public String getStyle(){
      return style;
   }
   
    public void setLogo(boolean k){
      logo = k;
   }
   public boolean getLogo(){
      return logo;
   }

   
   
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