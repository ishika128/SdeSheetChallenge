import java.util.* ;
import java.io.*; 
public class Solution {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        // Write your code here
        int [] arr = new int [m+n];
        int ptr1=0 ;
        int ptr2=0;
        int k= 0; 
      
        while(ptr1<m && ptr2<n)
        {
            
            if(arr1[ptr1]<arr2[ptr2])
            {
                arr[k]=arr1[ptr1];
                ptr1++;
                k++;
            }
             else 
            {
                arr[k]=arr2[ptr2];
                ptr2++;
                k++;
            }
            
            
        }
        while(ptr1<m)
        {
            arr[k]=arr1[ptr1];
            k++;
            ptr1++ ;
        }
        while(ptr2<n)
        {
             arr[k]=arr2[ptr2];
            k++;
            ptr2++ ;
        }
        
        return arr ;
    }
}
