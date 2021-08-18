/******************************************************

name: Eric Oliver

name of file: HW8

**Description: This program contains my main method. I created an orange object and tested both of my exception classes using the try catch method.

*******************************************************/
class HW8{
   public static void main(String[] args){
   
      Orange orange1;
      
      try{
      orange1 = new Orange("Orange", 10.0, "Navel", 100.00);
      }catch(InvalidJuiceWeightException ex){
         System.out.println(ex.errorMessage());
      }
      
      
      try{
      orange1 = new Orange("Orange", 10.0, "Navel", 10.00);
      for(int i = 0; i < 5; i++){
         orange1.Squeeze();
         }
      }
      catch(ExceededSqueezeAmountException ex){
         System.out.println(ex.errorMessage());
      }
      catch(InvalidJuiceWeightException ex){
         System.out.println(ex.errorMessage());
      }
   }
}
      
      
      
      //System.out.println(orange1.toString());
      
       /*try{
      orange1.Squeeze();
      System.out.println(orange1.toString());
      }
      catch(InvalidJuiceWeightException x){
         System.out.println("Juiceweight too high");
      }*/
      
      /*orange1.Squeeze();
      System.out.println(orange1.toString());
     
      orange1.Squeeze();
      System.out.println(orange1.toString());
      
      orange1.Squeeze();
      System.out.println(orange1.toString());
      
      orange1.Squeeze();
      System.out.println(orange1.toString());
      
      orange1.Squeeze();
      System.out.println(orange1.toString());
   }
}*/