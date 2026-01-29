/*
    Lecture note example - Input!!
*/
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        // Your Code Goes here!
        Scanner sc = new Scanner(System.in);
        
       double item1Price = 2.99;
       double item2Price = 5.51;
       double item3Price = 49.99;
        System.out.println("Welcome to Raffi's place");
        System.out.println("Here is our menu");
        System.out.println("1. 𓄀REDBULL🥤 - $" + item1Price);
        System.out.println("2. 🍔Raffi Slider...YUM - $" + item2Price);
        System.out.println("3. 🥩Mystery Meat? - $" + item3Price);
        System.out.println();
    
        System.out.println("What's the name of your order?");
        String name = sc.nextLine();
        System.out.println();
        
        System.out.println("How many REDBULLS would you like?!");
        int quantity1 = sc.nextInt();
        System.out.println("How many Sliders would you like?!");
        int quantity2 = sc.nextInt();
        System.out.println("How many Mystery Meats would you like?!?");
        int quantity3 = sc.nextInt();
        
        double total1 = item1Price * quantity1;
        double total2 = item2Price * quantity2;
        double total3 = item3Price * quantity3;
        double currentTotal = total1 + total2 + total3;
        System.out.println("Your current total is $ " + currentTotal);
        
        System.out.println("What percent would you like to tip?");
        double tipPercent = sc.nextDouble();
        double tip = currentTotal * (tipPercent/100);
        double grandTotal = currentTotal + tip;
        
        System.out.println("🧾 " + name +  "'s Receipt: ");
        System.out.println(quantity1 + " x 𓄀REDBULL🥤 = $" + total1);
        System.out.println(quantity2 + " x 🍔Raffi Slider...YUM - $" + total2);
        System.out.println(quantity3 + " x 🥩Mystery Meat? - $" + total3);
        System.out.println("Tip " + "(" + tipPercent + "%) = " + tip);
        System.out.println("_ _ _ _ _ _ _ _ _ _ _");
        System.out.println("Grand Total = $" + grandTotal);
        System.out.println("_ _ _ _ _ _ _ _ _ _ _");
        System.out.println("Thanks for dining at Raffi's place... NEVER come here again");
	}
}
