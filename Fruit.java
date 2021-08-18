/** CSC 2302 HW
 * Created by Chris on 8/4/2016.
 */
public abstract class Fruit
{
    private String color;
    private double weight;

    //Constructor to set the color and weight of the fruit
    Fruit(String color, double weight)
    {
        this.color = color;
        this.weight = weight;
    }

    //Returns the color of the fruit
    public String getColor()
    {
        return this.color;
    }

    //Returns the weight of the fruit
    public double getWeight()
    {
        return this.weight;
    }
    //Allows the ability to change the weight of the fruit
    //this will be necessary as the specific fruits are consumed
    public void setWeight(double weight)
    {
        this.weight = weight;
    }
    public String toString()
    {
        return " Color: " + this.color + " Weight: " + this.weight;
    }
}
