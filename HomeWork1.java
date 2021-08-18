/******************************************************

name: Eric Oliver

name of file: HomeWork1

**Description: This program will populate an integer array with 20 random integers and
 once called, the "Average" method will calculate the average of said integer array.
 
*******************************************************/

public class HomeWork1{
   public static void main(String[] args){
      
      int arr[] = new int[20];   //declared an integer array with a size of 20
         
      for(int i = 0; i < 20; i++){   //for loop to populate each integer of the array with a random integer
         arr[i] = ((int)(Math.random()*100));
         System.out.println(arr[i]);
         }
         Average(arr);   //Called my method to average the integer array of whatever length
   }
   public static void Average(int arr[]){
      int sum = 0;
      
      for(int i = 0; i < arr.length; i++){ //created a for loop to add all the values in my array
         sum += arr[i];       
      }
      int average = (sum/arr.length); //declared and initialized my "average" variable to compute the average of the random integer array
         System.out.println("The average of the Array is: " + average);

   }
}