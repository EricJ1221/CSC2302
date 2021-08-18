/******************************************************

name: Eric Oliver

name of file: HW3

**Description: This program contains my constructors and print methods for my SuperHero class
 
*******************************************************/

class SuperHero{ //created my SuperHeroClass
   
   private String HeroName;              
   private String AlterEgo;              
   private int Age;                      
   private String Description;           
   private String PlaceOfOrigin;         
   private String PowersOrAbilities;     
   
   SuperHero(){
      this("Batman", "Bruce Wayne", 28, "6'2\" pitch black body suit of specialized armor, super raspy voice", "Gotham", "New age weaponry and technology, martial arts/hand to hand combat" );
   }
   SuperHero(String a, String b, int c, String d, String e, String f){ 
      this.HeroName = a;
      this.AlterEgo = b;
      this.Age = c;
      this.Description = d;
      this.PlaceOfOrigin = e;
      this.PowersOrAbilities = f;  
   }  
   public void Print(){
      System.out.println(toString());
   }
   public String toString(){
      return "\nHero Name: " + HeroName + "\nAlter Ego: " + AlterEgo + "\nAge: " + Age + "\nDescription: " + Description + "\nPlace of Origin: " + PlaceOfOrigin + "\nPowers and Abilities: " + PowersOrAbilities;
   }

}