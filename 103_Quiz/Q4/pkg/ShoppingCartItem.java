package pkg;
import java.util.*;

public class ShoppingCartItem {
    // Global Variables //
    private String itemName;
    private double itemCost;
    private int quantity;
    
    // Constructors //
    public ShoppingCartItem(){
        itemName = "unknown";
        itemCost = 0;
        quantity = 0;
    }
    
    public ShoppingCartItem(String name, double cost, int quantity){
        itemName = name;
        itemCost = cost;
        this.quantity = quantity;
    }
    
    //Methods//
    public void cartToString(){
        System.out.println("You have " + quantity + " of " + itemName + " for " + itemCost + " each.");
    }
    
    public String getItemName(){
        return itemName;
    }
    
    public int getQuantity(){
        return quantity;
    }
    
    public double getCost(){
        return itemCost;
    }
    
    public double getTotalCost(){
        return (itemCost*quantity);
    }
    
    public double getTotalWithTax(){
        return ((itemCost*quantity)+((itemCost*quantity)*0.12));
    }
    
    public double quantityToCostCalculator(int quantity){
        return (itemCost *quantity);
    }
    
    public boolean compareItemCost(ShoppingCartItem a){
        if(a.getCost()< itemCost){
            return false;
        }
        else{
            return true;
        }
    }
    
    public ShoppingCartItem copyCart(){
        ShoppingCartItem item = new ShoppingCartItem(itemName, itemCost, quantity);
        return item;
    }
    
}
