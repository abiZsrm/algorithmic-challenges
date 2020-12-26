package chap03_Stacks.Queues.Test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import chap03.Problem_3_6;
import test.utlity.Animal;
import test.utlity.Cat;
import test.utlity.Dog;

public class Problem_3_6_Test
{
   @Test
   public void testAnimalShelter()
   {
	   Animal[] animals = new Animal[] { new Dog("D1"), new Cat("C1") }; 
	   for(Animal animal : animals)
	   {
		   Problem_3_6.shelterAnimal(animal);
	   }
	   
	   assertTrue("C1".equals(Problem_3_6.dequeueCat().getName())); 
	   assertTrue("D1".equals(Problem_3_6.dequeueDog().getName())); 
	   assertTrue("D1".equals(Problem_3_6.dequeueAny().getName())); 
   }
}
