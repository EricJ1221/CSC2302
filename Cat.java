
public class Cat extends Pet {

   public Cat(String name, int age, String color){
      super(name, age, color);
   }
   
   @Override
   public void speak(){
      System.out.println(this.name + " said meow");
   }
   @Override
   public void poop(){
      System.out.println(this.name + " poops");
   }
}