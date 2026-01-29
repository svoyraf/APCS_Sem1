import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws Exception {
		//Creating File instance to reference text file in Java
        File text = new File("./passwords.txt");			// This file must be in the same folder as your java/class files.
     
        //Creating Scanner instance to read File in Java
        Scanner numLines = new Scanner(text);			// Scanner for counting number of lines
        Scanner sc = new Scanner(text);					// New Scanner for taking in the lines.
     
	 	// Count number of lines in text file.
		int count = 0; 
        while(numLines.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
			numLines.nextLine();
            count++;
        }  
		
		String [] passwords = new String[count];		// This is the array you will be using.

        //Reading each line of the file using Scanner class
		int i = 0;
        while(sc.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
            String line = sc.nextLine();
            passwords[i] = line;
			i++;
        }  

		/* ----------------------------------------------------------------------------------------- */
		// Start here, use the array passwords
        
        /*for(i = 0; i < passwords.length; i ++){
            
            int s1, s2, s3 = 0;
            int none = 0;
            
            String p = passwords[i];
            
            if(p.length() >= 8 && (p.contains("!") || (p.contains("@") || (p.contains("#") || (p.contains("$") || (p.contains("%") || (p.contains("^") || (p.contains("*") || (p.contains("&"))){
                s3 ++;
            }
            
            else if(p.length() >= 8){
                s1 ++;
            }
            else if((p.contains("!") || (p.contains("@") || (p.contains("#") || (p.contains("$") || (p.contains("%") || (p.contains("^") || (p.contains("*") || (p.contains("&")){
                s2 ++;
            }
            else{
                none ++;
            }
        }
        
        System.out.println("There are " + s3 + " amount of passwords with a strength of three");
        System.out.println("There are " + s1 + " amount of passwords with a strength of one");
        System.out.println("There are " + s2 + " amount of passwords with a strength of two");
        System.out.println("There are " + none + " amount of passwords with a strength of none");
        */
        int one = 0;
        int two = 0;
        int three = 0;
        int none = 0;
        
        for(int p = 0; p < passwords.length; p ++){
            
            String [] arr = {"!", "@" , "#" , "$" , "%" , "^",  "&" , "*"};
            int length = passwords[p].length();
            if(length >= 8){
                one ++;
            }
            
            for(int o = 0; o < arr.length; o ++){
                
                String x = passwords[p];
                String comp = arr[o];
                
                if(length >= 8 && x.contains(comp)){
                    three ++;
                    break;
                }
                
                else if(x.contains(comp)){
                    two ++;
                    break;
                }
                
                
            }
            
        }
        
        System.out.println("There are " + none + " amount of passwords with no strength");
        System.out.println("There are " + one + " amount of passwords with a strength of one");
        System.out.println("There are " + two + " amount of passwords with a strength of two");
        System.out.println("There are " + three + " amount of passwords with a strength of three");
		
	}
}
