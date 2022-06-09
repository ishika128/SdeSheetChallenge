import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int findDuplicate(ArrayList<Integer> arr, int n)
    {
        
        int ans = 0 ;
        int [] freq = new int [n];
        int s = arr.size();
        Arrays.fill(freq,0);
        for(int i=0;i<s;i++)
        {
            if(freq[arr.get(i)]==0)
            {
                freq[arr.get(i)]++;
            }
            else
            {
           ans= arr.get(i);
            }
            
        }
        return ans ;
        
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
