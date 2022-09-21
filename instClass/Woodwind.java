//Child class

public class Woodwind extends Instrument
{

//Instance variables, attributes
private int numReeds;
private String transposeKey;

//Constructor without values
public Woodwind()
{
    numReeds = 0;
    transposeKey = " ";
}

//Constructor with values
Woodwind(String instName, String instFamily, double instWidth, double instHeight, int reed, String key)
{
    super(instName, "Woodwind Family", instWidth, instHeight);
    numReeds = reed;
    transposeKey = key;
}

//Setter methods
public void setReeds(int reed)
{
    numReeds = reed;
}


public void setKey(String key)
{
    transposeKey = key;
}

//Getter methods
public String getKey()
{
    return transposeKey;
}

public int getReeds()
{
    return numReeds;
}

//Method to override getInstInfo() method and add in additional Woodwind information
@Override 
public String getInstInfo()
{
    String woodwindInfo = "Name: " + getName() + ", Family: " + getFamily() + "\n" 
    + "Width: " + getWidth() + ", Length: " + getHeight() + "\n"
    + "Fun fact: These days woodwind instruments aren't made out of wood. And are usually metal or plastic.";
    return woodwindInfo;
}
}


