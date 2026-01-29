/* 
    Lecture note example - Methods
*/
import java.util.Scanner;

class LectureMethod{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numba 1: ");
        int num1 = sc.nextInt();
        System.out.println("Numba 2: ");
        int num2 = sc.nextInt();
        
        System.out.println(squared(num1));
        int num1Squared = squared(num1);
        System.out.println(num1Squared);
        
        System.out.println(absolute(num1));
        int num1absolute = absolute(num1);
        System.out.println(num1absolute);
        
        System.out.println(absolute(num2));
        int num2absolute = absolute(num2);
        System.out.println(num2absolute);
        
	}
	
	public static int squared(int a){
	    int answer = a * a;
	    return answer;
	}
	
	public static int absolute(int a){
	    if(a<0){
	        return a * (-1);
	    }
	    else{
	        return a;
	    }
	    
	    
	}
}