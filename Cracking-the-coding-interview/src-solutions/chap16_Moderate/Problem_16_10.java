package chap16_Moderate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Living People: Given a list of people with their birth and death years,
 * implement a method to compute the year with the most number of people alive.
 * You may assume that all people were born between 1900 and 2000 (inclusive).
 * If a person was alive during any portion of that year, they should be
 * included in that year's count. For example, Person (birth = 1908, death =
 * 1909) is included in the count for both 1908 and 1909.
 */
public class Problem_16_10
{
	public static void main(String[] args) 
	{
		
		List<People> peoples = Arrays.asList(new People(1912, 1915), 
				  new People(1920, 1990),
			  	  new People(1910, 1998),
			 	  new People(1901, 1972),
				  new People(1910, 1998),
				  new People(1923, 1982),
				  new People(1913, 1998),
				  new People(1990, 1998),
				  new People(1983, 1999),
				  new People(1975, 1994));; 
		int startYear = 1900; 
		int endYear = 2000; 
		
		int maxPeopleAlive = 0; 
		int maxPeopleYear = 0; 
		
		int curPeopleAlive = 0; 
		for(int start = 1900; start < 2000; start++)
		{
			for(People people : peoples)
			{
				if(start >= people.birth && start < people.death)
				{
					curPeopleAlive++; 
				}
			}
			System.out.println("Year: " + start + " Alive: " + curPeopleAlive);
			if(curPeopleAlive > maxPeopleAlive)
			{
				maxPeopleYear = start; 
				maxPeopleAlive = curPeopleAlive; 
			}
			
			curPeopleAlive = 0; 
		}
		
		System.out.println("Max Year: " + maxPeopleYear + " : " + "Max Alive: " + maxPeopleAlive);
	}
}

class People
{
	public int birth; 
	public int death; 
	
	public People(int birth, int death)
	{
		this.birth = birth; 
		this.death = death; 
	}
}