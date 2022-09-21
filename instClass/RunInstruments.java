/*
Author: zoza21
Date: 07/07/2022
*/

//Class with main methods to test parent/child classes and methods

public class RunInstruments
{
    public static void main (String[] args) 
    {
        
        Instrument piano = new Instrument();
        piano.setName("Piano");
        piano.setFamily("Percussion and String");
        piano.setWidth(155);
        piano.setHeight(120);
        System.out.println(piano.getInstInfo());


        StringInst doubleBass =  new StringInst("Double Bass", "Strings", 180, 60, 4, "E, A, G, D");
        System.out.println(doubleBass.getInstInfo());

        Woodwind oboe = new Woodwind("Oboe", "Woodwind", 5, 65, 2, "A");
        System.out.println(oboe.getInstInfo());
    
    }
}


