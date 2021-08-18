/******************************************************

name: Eric Oliver

name of file: HW7

**Description: This program contains my main method. I created objects of each type, Undergraduate and Graduate, and tested their functionallity.

*******************************************************/

class HW7{
   public static void main(String[] args){
      
      Undergraduate student1 = new Undergraduate("Jack", "Culture", "Senior");
      student1.setStudentClass("Freshman");
      System.out.println(student1.toString());  
           
      Undergraduate student2 = new Undergraduate("Jim Bob", "Geology", "Sophomore");
      System.out.println(student2.toString());
      
      Graduate student3 = new Graduate("Tina", "Dance", "Doctoral"); 
      student3.setStudentClass("Masters");
      System.out.println(student3.toString());
      
      Graduate student4 = new Graduate("Regina", "Liberal Arts", "Doctoral");
      System.out.println(student4.toString()); 
      System.out.println(student4.getStudentClass());
      
   }
}