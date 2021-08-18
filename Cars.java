

public class Cars{
   private String color;
   private String modelType;
   private String manufacturer;
   private int maxHP;
   private boolean customRims;
   private int fuel;
   private boolean carState;
   
   Cars(){  
      this.color = "brown";
      this.modelType = "sedan";
      this.manufacturer = "Honda";
      this.maxHP = 120;
      this.customRims = false;
      this.fuel = 7;
      this.carState = false;
   }
   
   Cars(String carColor, String typeOfCar, String whoMadeIt, int horsePower, boolean spinners, int gasDieselBattery, boolean carState){
      this.color = carColor;
      this.modelType = typeOfCar;
      this.manufacturer = whoMadeIt;
      this.maxHP = horsePower;
      this.customRims = spinners;
      this.fuel = gasDieselBattery;
      this.carState = false;
   }
   
   public String toString(){
      return "\nThe color of the car is " + color + "\nThe model/type of car is " + modelType + "\nThe manufacturer is " + manufacturer + "\nThe max horse power is " + maxHP + 
      "\nDoes it have custom rims? " + customRims + "\nDoes the vehicle have fuel? " + fuel + " gallons" + "\nIs the car on? " + carState;
   }
   
   public String CheckFuel(int fuel){
      if(fuel < 5)
         return "\n The vehicle has a 1/4 of a tank of fuel, go gas it up wageslave peasant";
      else if(fuel > 5 && fuel < 10)
         return "\n The vehicle has a 1/2 of a tank of fuel, you can most definitely test drive it my good sir";
      else if(fuel > 10 && fuel < 15)
         return "\n The vehicle has 3/4 of a tank of fuel, don't go too fast now ya hear?";
      else if(fuel > 15 && fuel <= 20)
         return "\n The vehicle has full tank of gas, who wants to buy it as is?";
      else
         return "\n The car has no fuel";     
   }
   
   public void startCar(){
      if(fuel > 0 && carState == false){
         carState = true; 
         }
      System.out.print("\n The car turns on.");   
   }
   public void turnCarOff(){
      carState = false;
      System.out.print("\nThe car turns off.");
   }
   /*public void useHorn(String horn){
      String horn = "Beep!";
      System.out.println(horn);
   }*/
      
}
