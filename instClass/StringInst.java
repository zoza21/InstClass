
//Child class

public class StringInst extends Instrument {

//Instance variables, attributes
private int numStrings;
private String tuning;

//Constructor with no parameters
public StringInst()
{
    numStrings = 0;
    tuning = " ";
}

//Constructor with parameters
StringInst(String instName, String instFamily, double instWidth, double instHeight, int strings, String tune)
{
    super(instName, instFamily, instWidth, instHeight);
    numStrings = strings;
    tuning = tune;
}

//Setter methods
public void setStrings(int strings)
{
    numStrings = strings;
}

public void setTuning(String tune)
{
    tuning = tune;
}

//Getter methods
public int getStrings()
{
    return numStrings;
}


public String getTuning()
{
    return tuning;
}

}

