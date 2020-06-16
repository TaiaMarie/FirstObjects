package io.codedifferently;

import org.junit.Assert;
import org.junit.Test;

public class Humantest {

  @Test 
  public void constructorTest(){
      // given
      String first = "Laila";
      String last = "Thompson";
      int energy = 50;

      // when
      Human testHuman = new Human(first, last);
      String actualFirst = testHuman.getFirstName();
      String actualLast = testHuman.getLastName();
      int actualEnergy = testHuman.getEnergy() ;

      // then
      Assert.assertEquals(first, actualFirst);
      Assert.assertEquals(last, actualLast);
      Assert.assertEquals(energy, actualEnergy);
  } 

  @Test

  public void eatTest()
  {
      //Given

      Fruit grape = new Fruit("grape", 10);
      int expectedEnergy = 60;
      Human testHuman = new Human("Sasha", "Stone");

      //When
      testHuman.eat(grape);;
      int actualEnergy = testHuman.getEnergy();

      //Then 
      Assert.assertEquals(expectedEnergy, actualEnergy);
  }

  @Test

  public void workTest()
  {
    //Given
    Human testHuman = new Human("David", "Robinson");
    int expectedEnergy = 30;

    //When
    testHuman.work(2);
    int actualEnergy = testHuman.getEnergy();

    //Then
    Assert.assertEquals(expectedEnergy, actualEnergy);
  }

  @Test
  public void energyMaxTest()
  {
    //Given
    Human testHuman = new Human("Mikaela", "Brown");

    Fruit testFruit1 = new Fruit("Strawberry", 20); 
    Fruit testFruit2 = new Fruit("Bannana", 20);
    Fruit testFruit3 = new Fruit("Kiwi", 20);  

    Human.maxEnergy = 100;

    //When
    testHuman.eat(testFruit1);
    testHuman.eat(testFruit2);
    testHuman.eat(testFruit3);

    int actualEnergy = testHuman.getEnergy(); 

    //TAhen
    Assert.assertEquals(100, actualEnergy  );
  
  }

  @Test
  public void workMin()
  {
    //Given
    Human testHuman = new Human("Meredith", "Grey");

    //When
    testHuman.work(6);
    int actualEnergy = testHuman.getEnergy();

    //Then
    Assert.assertEquals(50, actualEnergy);
  }

  @Test
  public void maxEnergyChangeTest()
  {
    //Given
    Human h1 = new Human("Maggie", "Pierce"); 

    Fruit testFruit1 = new Fruit("Strawberry", 20); 
    Fruit testFruit2 = new Fruit("Bannana", 20);
    Fruit testFruit3 = new Fruit("Kiwi", 20); 

    //When
    Human.maxEnergy = 150;

    h1.eat(testFruit1); 
    h1.eat(testFruit2);
    h1.eat(testFruit3);

    int actualEnergy = h1.getEnergy();

    //Then
    Assert.assertEquals(110, actualEnergy);
  }

    

    
} 