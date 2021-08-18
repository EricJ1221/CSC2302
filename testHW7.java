/******************************************************

name: Eric Oliver

name of file: HW7

**Description: This program contains my

*******************************************************/

class testHW7{
   public static void main(String[] args){
      
      Undergraduate student1 = new Undergraduate("Jack", "Culture", "Senior");
      student1.setStudentClass("Freshman");
      System.out.println(student1.toString()); //also populating null for classification
      
      Undergraduate student2 = new Undergraduate("Jim Bob", "Geology", "Sophomore");
      System.out.println(student2.toString());
      
      Graduate student3 = new Graduate("Tina", "Dance", "Doctoral"); //populating this as my undergraduate and not my graduate, but that makes sense because Graduate inherits from student, also populating null for classification
      student3.setStudentClass("Masters");
      System.out.println(student3.toString());
      
      Graduate student4 = new Graduate("Regina", "Liberal Arts", "Doctoral");
      System.out.println(student4.toString()); 
      System.out.println(student4.getStudentClass());
      
   }
}