import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void setZeros(int matrix[][])
    {
        // Write your code here..
        int r = matrix.length ;
        int c = matrix[0].length ;
        int d1[] = new int [r];
        int d2[] = new int [c] ;
        Arrays.fill(d1, -1);
        Arrays.fill(d2,-1);
        for(int i=0 ;i < r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(matrix[i][j]==0)
                {
                    d1[i]=0;
                    d2[j]=0;
                }
            }
        }
        for(int i=0;i< r; i++)
        {
            for(int j=0;j<c;j++)
            {
                if(d1[i]==0 || d2[j]==0)
                {
                    matrix[i][j]=0;
                }
            }
        }
    
    }
     

}
