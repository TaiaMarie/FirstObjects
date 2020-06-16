package io.codedifferently;

import javax.sound.sampled.SourceDataLine;

public class Human {

    private String firstName;
    private String lastName;
    private int energy;
    static int maxEnergy = 100;
    
    

    public Human(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.energy = 50;
    }

    public void eat(Fruit fruit) 
    {
        if((this.energy + fruit.getEnergy()) <= maxEnergy)
        {
            this.energy = (this.energy + fruit.getEnergy() );
        }
        else
        {
            this.energy = maxEnergy;
            System.out.println("We are full of energy");;
        }
        
    }

    public void work(int hours)
    {
        int energySpent = hours * 10;

        if((this.energy - energySpent) <  0)
        {
            System.out.println("Couldn't do the work because energy is too low, try and eat something to increse the energy");
        }
        else
        {
            this.energy = (this.energy - energySpent);     
        }
        
    }

    public String getFirstName()
    {
        return this.firstName;
    }

    public String getLastName()
    {
        return this.lastName;
    }

    public int getEnergy()
    {
        return this.energy;
    }


}