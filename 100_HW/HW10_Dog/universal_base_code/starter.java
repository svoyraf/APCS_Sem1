/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Dog test = new Dog();
		Dog Tokyo = new Dog("Tokyo", 2);
		Dog Berlin = new Dog("Berlin", "Doberman");
		
		if((Tokyo.isSleeping() = false)){
			Tokyo.bark();
		}
		else{
			System.out.println("Tokyo is asleep");
		}
		
		if((Berlin.isSleeping() = true) && (Tokyo.isSleeping() = false)){
			Berlin.bark();
		}
		
		if((Berlin.isSleeping() = false) && (Tokyo.isSleeping() = false)){
			Berlin.bark();
		}

		
	


	}
}
