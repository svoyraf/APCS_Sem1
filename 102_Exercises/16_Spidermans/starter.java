/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Spiderman Default = new Spiderman();
	Default.getActor();
	Default.getAge();
	Default.getVillain();
	System.out.println();
	
	Spiderman Tobey = new Spiderman("Tobey Maguire", 48, "Green Goblin");
	System.out.println(Tobey.getActor());
	System.out.println(Tobey.getAge());
	System.out.println(Tobey.getVillain());
	System.out.println();
	
	Spiderman Andrew = new Spiderman("Andrew Garfield");
	System.out.println(Andrew.getActor());
	System.out.println(Andrew.getAge());
	System.out.println(Andrew.getVillain());
	System.out.println();
	
	Spiderman Tom = new Spiderman("Tom Holland", 27, "The Vulture");
	System.out.println(Tom.getActor());
	System.out.println(Tom.getAge());
	System.out.println(Tom.getVillain());
		
	}
}
