/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}
	public static int randAge(){
		int randAge = (int)(Math.random()*100);
		return randAge;
	}

	public static void main(String args[]) {
		// Your code goes below here
		int dupeamt = 0;
		
		PooleDwarf one = new PooleDwarf();
		
		PooleDwarf two = new PooleDwarf((randName()), (randAge()));
		
		PooleDwarf three = new PooleDwarf((randName()), (randAge()));
		three.isSameName(two);
		three.isSameName(three);
		three.isSameName(four);
		three.isSameName(five);
		three.isSameName(Diddyblud);
		three.isSameName(seven);
		
		PooleDwarf four = new PooleDwarf((randName()), (randAge()));
		
		PooleDwarf five = new PooleDwarf((randName()), (randAge()));
	
		PooleDwarf Diddyblud = new PooleDwarf((randName()), (randAge()));
		
		PooleDwarf seven = new PooleDwarf((randName()), (randAge()));
		
			if(one.isSameName(two)){
			dupeamt ++;
		}
		if(one.isSameName(three)){
			dupeamt ++;
		}
		if(one.isSameName(four)){
			dupeamt ++;
		}
		if(one.isSameName(five)){
			dupeamt ++;
		}
		if(one.isSameName(Diddyblud)){
			dupeamt ++;
		}
		if(one.isSameName(seven)){
			dupeamt ++;
		}
		if(two.isSameName(one)){
			dupeamt ++;
		}
		if(two.isSameName(three)){
			dupeamt ++;
		}
		if(two.isSameName(four)){
			dupeamt ++;
		}
		if(two.isSameName(five)){
			dupeamt ++;
		}
		if(two.isSameName(Diddyblud)){
			dupeamt ++;
		}
		if(two.isSameName(seven)){
			dupeamt ++;
		}

		
		
	}
}
	