/**
 * Created by Chris on 8/4/2016.
 */

public class Orange extends Fruit
{
    private String name;
    private double juiceWeight;
    private double squeezeAmount;

    //Constructor to build the orange
    
    Orange(String color, double weight, String name, double juiceWeight)throws InvalidJuiceWeightException
    {
        super(color, weight);
        this.name = name;
               
        
        
        //Sets the value for how much juice is squeezed per squeeze based
        //on the value of the juiceweight
        setSqueezeAmount(0.25);
    }

    //Determine amount squeezed per squeeze.
    private void setSqueezeAmount(double percent)
    {
        squeezeAmount = juiceWeight * percent;
    }

    //Squeeze juice from the orange.  Each time this method is called, the juiceweight
    //as well as the total weight must be adjusted.  Eventually there will be no more
    //juice in the fruit
    public void Squeeze()throws ExceededSqueezeAmountException
   {
   
   }
}

