
import java.util.Random;
public class Example {
   public static void main(String[] args) {
      
      int[] arr = new int[5];
      for (int i = 0; i < arr.length; i++) {
         arr[i] = ((int)Math.random()*100); // storing random integers in an array
         System.out.println(arr[i]); // printing each array element
      }
   }
}