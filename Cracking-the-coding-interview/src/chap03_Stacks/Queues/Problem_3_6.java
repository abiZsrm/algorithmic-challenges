package chap03_Stacks.Queues;

import java.util.LinkedList;
import java.util.Queue;

import test.utlity.Animal;
import test.utlity.Cat;
import test.utlity.Dog;

/**
 * Animal Shelter: An animal shelter, which holds only dogs and cats, operates
 * on a strictly "first in, first out" basis. People must adopt either the
 * "oldest" (based on arrival time) of all animals at the shelter, or they can
 * select whether they would prefer a dog or a cat (and will receive the oldest
 * animal of that type).
 * 
 * They cannot select which specific animal they would like.
 * 
 * Create the data structure to maintain this system and implement operations
 * such as enqueue, dequeueAny, dequeueDog and dequeueCat. You may use the
 * built-in LinkedList data structure.
 * 
 * (11.30.2019)
 */
public class Problem_3_6
{
	private static Queue<Animal> animalShelter = new LinkedList<Animal>(); 
	
	public static Animal dequeueAny()
	{
		if(!Problem_3_6.animalShelter.isEmpty())
		{
			return Problem_3_6.animalShelter.remove(); 
		}
		
		return null; 
	}
	
	public static Animal dequeueCat()
	{
		Animal toAdopt = null; 
		
		for(Animal animal : Problem_3_6.animalShelter)
		{
			if(animal instanceof Cat)
			{
				toAdopt = animal; 
				break; 
			}
		}
		
		return toAdopt; 
	}
	
	public static Animal dequeueDog()
	{
		Animal toAdopt = null; 
		
		for(Animal animal : Problem_3_6.animalShelter)
		{
			if(animal instanceof Dog)
			{
				toAdopt = animal; 
				break; 
			}
		}
		
		return toAdopt; 
	}
	
	public static void shelterAnimal(Animal animal)
	{
		// Enqueue Operation. 
		Problem_3_6.animalShelter.add(animal); 
	}
}
