/******************************************************

name: Eric Oliver

name of file: HW3

**Description: This program contains my main and will call upon my constructors from my SuperHero.java class to create my SuperHero objects
 
*******************************************************/

public class HW3{
   public static void main(String []args){
      
      SuperHero hero1 = new SuperHero(); 
         hero1.Print();
         
      SuperHero hero2 = new SuperHero("DareDevil" , "Matt Murdock, Attorney at Law", 30, "Red leather Suit", "Hells Kitchen, New York City", "he is blind but can somehow see sounds much like sonar from chemical burns as a child");
         hero2.Print();
   }
}

