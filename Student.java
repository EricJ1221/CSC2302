/******************************************************

name: Eric Oliver

name of file: HW7

**Description: This program contains my parent class, Student, which includes a default constructor, an overloaded constructor, getters and setters and my abstract methods for my children classes.

*******************************************************/
public abstract class Student{
   private String name;
   private String major;
   
   
   Student(){
      this.name = "John";
      this.major = "Computer Science"; 
   } 
   
   Student(String studentName, String studentMajor){
      this.name = studentName;
      this.major = studentMajor;
         
   }
   public String getName(){
      return name;
   }
   public String getMajor(){
      return major;
   }
   public abstract void setStudentClass(String studentClass); 
   
   public abstract String getStudentClass();
   
   public String toString(){
      return "\nThe students name is " + this.name + "\nThe students major is " + this.major;
   } 
}