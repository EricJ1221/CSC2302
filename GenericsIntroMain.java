import java.util.ArrayList;

public class GenericsIntroMain {

   public static void main(String[] args){
      ArrayList<Integer>items = new ArrayList<Integer>();
      items.add(1);
      items.add(2);
      items.add(3);
      items.add(4);
      items.add(5);
      
      printDoubled(items);
}

   private static void printDoubled(ArrayList<Integer> n){
      for(Object i : n){
         System.out.print((Integer) i * 2);
      }
   }
}