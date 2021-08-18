public class InvalidJuiceWeightException extends Exception{
   
   //double weight;
   double overWeight;
      
   public InvalidJuiceWeightException(double overWeight){
   this.overWeight = overWeight;
   }
   
   public double getOverWeight(){
      return this.overWeight;
   }
   
   public String errorMessage(){
      return "The juiceWeight is over " + overWeight + " the total weight of the fruit";
   }
}
   