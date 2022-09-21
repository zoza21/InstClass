//Parent class

public class Instrument
{

//Instance variables, attributes
private String name, family;
private double width, height;

//Constructor with no parameters
public Instrument()
{
    name = " ";
    family = " ";
    width = 0;
    height = 0;
}

//Constructor with parameters
Instrument(String instName, String instFamily, double instWidth, double instHeight)
{
    name = instName;
    family = instFamily;
    width = instWidth;
    height = instHeight;
}

//Setter methods
public void setName(String instName)
{
    name = instName;
}

public void setFamily(String instFamily)
{
    family = instFamily;
}

public void setWidth(double instWidth)
{
    width = instWidth;
}

public void setHeight(double instHeight)
{
    height = instHeight;
}


//getter methods
public String getName()
{
    return name;
}

public String getFamily()
{
    return family;
}

public double getWidth()
{
    return width;
}

public double getHeight()
{
    return height;
}

//Method to print string with all info
public String getInstInfo()
{
    String instrumentInfo = "Name: " + getName() + ", Family: " + getFamily() + "\n" 
    + "Width: " + getWidth() + ", Length: " + getHeight() + ".";
    
    return instrumentInfo;
}

}