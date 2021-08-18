
public abstract class Pet { //abstract class can be thought of as a template for a class

   String name;
   int age;
   String color;
   
   
   public Pet(String name, int age, String color){
   this.name = name;
   this.age = age;
   this.color = color;
   }
   
   public String getName(){
      return name;
   }
   
   public void setName(String name){
      this.name = name;
   }
   
   public int getAge(){
      return age;
   }
   
   public void setAge(int age){
      this.age = age;
   }
   
   public String getColor(){
      return color;
   }
   
   public void setColor(String color){
      this.color = color;
   }
     
   public abstract void speak();
   
   public abstract void poop();
}