

public class Dog extends Pet {

   public Dog(String name, int age, String color){
      super(name, age, color);
   }
   
   @Override
   public void speak(){
      System.out.println(this.name + " said bark");
   }
   @Override
   public void poop(){
      System.out.println(this.name + " poops");
   }
   public void sniffButt(String a){
      System.out.println(this.name + " sniffs " + a + "'s butt");
   }
   
}