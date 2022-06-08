import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices)
    {
        // Write your code here.
        int maxProfit = 0 ;
        int min = prices.get(0);
        int l = prices.size();
        for(int i =0 ;i < l; i ++ )
        {
            if(min>prices.get(i))
            {
                min=prices.get(i);
            }
            else
            {
                
                int latest = prices.get(i)-min ;
                if(maxProfit<=latest)
                {
                    maxProfit = latest ;
                }
            }
       
            
            
            
            
        }
             return maxProfit ;
        
        
        
        
        
        
        
        
    }
}
