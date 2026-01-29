/*
   * Author:
   * Date:
   * Collaborator(s):
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a sentence");
		
		String ans = sc.nextLine();
		int x = ans.indexOf(" ");
		String str = "";
		
		while(x != -1){
			
			int space = ans.indexOf(" ");
			String word = ans.substring(0, space);
			
			ans = ans.substring(space + 1);
			str = str + " " + compare(word);
			
			x = ans.indexOf(" ");
			
		}
		
		System.out.println(str + " " + compare(ans));
		
	}
	
	public static String compare(String word){
		
		String [] vowels = {"a", "e", "i", "o", "u"};
		
		for(int i = 0; i < vowels.length; i ++){
			
			if(word.substring(0, 1).equals(vowels[i])){
					
					return word + "way";
					
				}
			
		}
			
			int x = 0;
			
			while(x < word.length()){
				
				String z = word.substring(x, x + 1);
				
				for(int i = 0; i < vowels.length; i ++){
					
					if(z.equals(vowels[i])){
						
						return word.substring(x) + word.substring(0, x) + "ay";
						
					}
					
				}
				
				x++;
				
		}
		
		return word + "ay";
		
	
	
	
}
}

