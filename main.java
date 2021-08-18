 
 public class main{
   public static void main(String[] args) {
      
      Dog myDog = new Dog("Odie", 2, "Brown");
      Cat myCat = new Cat("Garfield", 4, "Orange");
      
      myDog.speak();
      myCat.speak();
      myDog.poop();
      myCat.poop();
      
      myDog.sniffButt("Garfield");
      System.out.println(myDog.getColor());
   
   }
 }