import java.util.ArrayList;
import java.util.Collections;
/**
 * Write a description of class Temperature here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Temperature
{
    /**
     * Constructor for objects of class Temperature
     */
    public Temperature()
    {
        ArrayList<Double> temperatures = new ArrayList<Double>();
        temperatures.add(37.2);
        temperatures.add(32.5);
        temperatures.add(37.9);
        temperatures.add(39.3);
        
        fever(temperatures);
    }
    
    public static void fever(ArrayList<Double>temperatures) {
        int count = 0;
        double max = 0.0;
        for(Double temp: temperatures){
            if(temp>37.5){
                count++;
            }
            if(temp>max){
                max = temp;
            }
            System.out.println("Number of fever temperature" + count);
            System.out.println("Maximum temperature recorded" + max);
            
            //Q26
            System.out.println("Max element" + Collections.max(temperatures));
            
            //Q27
            Collections.sort(temperatures);
            System.out.println("Max elements (sorted list)" + temperatures.getLast());
        }
    }
    //
}