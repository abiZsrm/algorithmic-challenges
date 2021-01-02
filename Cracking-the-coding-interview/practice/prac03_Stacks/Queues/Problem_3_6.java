package prac03_Stacks.Queues;

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
 */
public class Problem_3_6
{
	private static Queue<Animal> animalShelter = new LinkedList<Animal>(); 
	
	public static Animal dequeueAny()
	{
		return null; 
	}
	
	public static Animal dequeueCat()
	{
		return null; 
	}
	
	public static Animal dequeueDog()
	{
		return null; 
	}
	
	public static void shelterAnimal(Animal animal)
	{
		// Enqueue Operation. 
		Problem_3_6.animalShelter.add(animal); 
	}
}
