
public class CarLot{
   public static void main(String[] args){
   
   Cars[] carsInLot = new Cars[4];
   
   carsInLot[0] = new Cars("red", "coupe", "Ferari", 180, true, 10, false);
   carsInLot[0].checkFuel(fuel);
   carsInLot[1] = new Cars();
   
   System.out.println(carsInLot[0]);
   
   carsInLot[1].startCar();
   System.out.println(carsInLot[1].toString());
   carsInLot[1].turnCarOff();
   System.out.println(carsInLot[0].useHorn());
   
   
   }
}