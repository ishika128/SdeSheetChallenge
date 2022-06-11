import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

    class LinkedListNode {
        int data;
        LinkedListNode next;
        
        public LinkedListNode(int data) {
            this.data = data;
        }
    }

*****************************************************************/


public class Solution {
    static LinkedListNode addTwoNumbers(LinkedListNode l1, LinkedListNode l2) {
        // Write your code here. ListNode ans = new ListNode(0);
        LinkedListNode ans = new LinkedListNode(0);
        LinkedListNode curr = ans ;
       LinkedListNode p1= l1 ;
       LinkedListNode q1 =l2;
        int carry=0;
        while(p1!=null || q1!=null )
        {
            int x= (p1!=null)?p1.data:0;
            int y =(q1!=null)?q1.data:0;
            int sum = carry +x+y;
            carry=sum/10;
            curr.next=new LinkedListNode(sum%10);
            curr=curr.next ;
            if(p1!=null)
                p1=p1.next;
            if(q1!=null)
                q1=q1.next;
            
            
            
        }
        if(carry>0)
        {
            curr.next=new LinkedListNode(carry);
        }
        return ans.next; 
    
    }
}
