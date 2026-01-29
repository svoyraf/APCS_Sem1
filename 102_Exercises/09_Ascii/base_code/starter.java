/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose either an animal, an object, or a face");
		String ans = sc.nextline();
		
		if((ans.equals("Animal")) || (ans.equals("animal"))){
			System.out.println("                                            ");
			System.out.println("                           _____            ");
			System.out.println("                          /   o  \\          ");
			System.out.println("                         |   ____>>>\\_      ");
			System.out.println("                         |     /    >\\>     ");
			System.out.println("                        /  __/              ");
			System.out.println("             ___       /  /                 ");
			System.out.println("            /   \\     /  /                  ");
			System.out.println("  _        /  _  \\   /  /                   ");
			System.out.println(" | |      / /  \\   \/  /                    ");
			System.out.println(" \\  \    / /    \\     /                     ");
			System.out.println("  \\  \ _/ /      \\   /                      ");
			System.out.println("   \\_____/        \\_/                       ");
		}
		if((ans.equals("Object")) || (ans.equals("object"))){
			
			System.out.println("        /           -----------------       ");
			System.out.println("       /                            /       ");
			System.out.println("      /                            /        ");
			System.out.println("     /_____________               /         ");
			System.out.println("    /              \\             /          ");
			System.out.println("   /                \\           /           ");
			System.out.println("   \\                 |         /            ");
			System.out.println("    \\                /        /             ");
			System.out.println("     \\              /        /              ");
			System.out.println("      \\____________/        /               ");
		}
		if((ans.equals("Face")) || (ans.equals("face"))){
			System.out.println("   _______________________________________");
			System.out.println("   ||||||||\\|||||||||||||||||||||/||||||||");
			System.out.println("   |        \\|||||||||||||||||||/        |");
			System.out.println("   |          \\||||||||||||||||/         |");
			System.out.println("   |           \\--------------/          |");
			System.out.println("   |                                      |");
			System.out.println("   |                                      |");
			System.out.println("   |         _               _            |");
			System.out.println("   |        /  \\            | |          |");
			System.out.println("   |       / _  \\         /  _ \\        |");
			System.out.println("   |------| |_| |--------|  |_| |-------- |");
			System.out.println("   |       \\___/    /\    \\____/        |");
			System.out.println("   |               /  \\                   |");
			System.out.println("   |              /_||_\\                  |");
			System.out.println("   |          ________________            |");
			System.out.println("   |         \\ |   |  |   | /            |");
			System.out.println("   |          \\|___|__|___|/             |");
			System.out.println("   |                                      |");
			System.out.println("   |______________________________________|");
			
	}

}
}