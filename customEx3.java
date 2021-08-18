import java.io.Serializable;

/**
 * Created by Chris on 4/13/2016.
 */
public class customEx3 implements Serializable
{
    private int v1;
    private double v2;
    private String v3;

    //Must make transient to use in serializable.  However, it will  ignore it.
    //This means you cannot use it for writing to an object stream.
    private transient A v4;

    customEx3(int v1, double v2, String v3)
    {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.v4 = new A();
    }
    public String toString()
    {
        return "integer: " + this.v1 + ", double: " + this.v2 + ", String: " + v3;
    }
}


class A
{
    //Has some data in it.
}