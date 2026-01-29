/*
	Author: 
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter your word or phrase:");
	String ans = sc.nextLine;
	
	while(sent.indexOf(" ") != -1){
		String word = ans.subString(0, ans.indexOf(" "));
		System.out.print(sponeWord(word) + " ");
		ans = ans.subString(ans.indexOf(" ") + 1);
		
	}
	
	System.out.println(spongeWord(ans));
	
	}
	
	public static String spongeWord(String word){
		String L = "";
		
		for(int i = 0; i < ans.length(); i++){
		
		String letter = ans.subString(i, i + 1);
		
		if(i % 2 == 0){
			
			letter = letter.toLowerCase();
			
		}
		else{
			
			letter = letter.toUpperCase();
			
		}
		
		ans = ans + letter;
		
	}
		
	}
		/*public static String convert(String x){
		
		for(int i = 0; i < x.length(); i ++){
			
			int y = 0;
			
			y ++;
			
			if(x.subString(i).equals(" ")){
			
			y --;
				
			}
			
			if(y)
			
		}	
			
			
	}*/
	
	
	
}
