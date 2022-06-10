import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        int ans [] = new int[2];
        int k = 0 ;
        int missing = 0 ;
        int repeating = 0 ;
        
        for(int i=1;i<=n;i++)
        {
            int count = 0 ;
            for(int j=0;j<arr.size();j++)
            {
                
                if(i==arr.get(j))
                {
                    count++ ;
                }
              
                
            }
              if(count==0)
                {
                  missing= i ; 
                }
               if(count>1)
              {
              repeating = i ;
           
               }
            
        }
       ans[0] = missing ;
        ans[1]=repeating ;
        return ans ;
    }
}
