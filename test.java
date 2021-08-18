public class test{
   public static void main(String[] args){
     
     Obj a = new Obj(10);
    a.print();
  }
}
class Obj {
  int num = 9;

  Obj (int num) {
    this.num = 2;   
  }

  public void print() {
    System.out.print(num);
  }
}

     
     
      /*D dObject = new D();
      System.out.print (dObject.toString());;
   }
}

class D extends C{
   public D() {
      System.out.println("D created!");
   }
   public String toString(){
      return super.toString() + "D";
   }
   }
   class C extends B{
   public C() {
      System.out.println("C created!");
   }
   public String toString(){
      return super.toString() + "C";
   }
   }
   class B extends A{
   public B() {
      System.out.println("B created!");
   }
   public String toString(){
      return super.toString() + "B";
   }
   }
   class A {
   public A() {
      System.out.println("A created!");
   }
   public String toString(){
      return "A";
   }
}*/
