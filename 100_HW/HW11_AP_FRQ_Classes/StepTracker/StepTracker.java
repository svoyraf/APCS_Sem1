import java.util.*;

public class StepTracker{
    // Global Variables //
    int steps;
    int [] days = new int[i];
    int avg;
    
    // Constructors //
    public StepTracker(){
        steps = 0;
        days[i] = steps;
        i = 1;
    }
    
    // Methods //
    public void addDailySteps(int a){
        steps = steps + a;
        i ++;
    }
    
    public int activeDays(){
        int active = 0;
        while(i < arr.length){
            if(days[i] >= 10000){
                active ++;
            }
            else{
                active = active;
            }
            return active;
        }
    }
    
    public double averageSteps(){
        avg = steps/i;
        return avg;
    }
    
    
}
