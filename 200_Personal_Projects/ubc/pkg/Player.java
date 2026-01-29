/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class Card {
	
	String name;
	double attack;
	double health;
	int cost;
	String ability;
	
	public Card(String name, double attack, double health, int cost, String ability) {
		
		this.name = name;
		this.cost = cost;
		this.health = health;
		this.ability = ability;
		
	}

}
