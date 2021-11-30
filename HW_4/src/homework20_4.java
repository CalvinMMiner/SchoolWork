/*
Given a linked list, remove all elements from a linkedlist of 
integers that have value val. In this program, you need to 
(1) read 6 numbers, add the first 5 numbers in the linkedlist
the last one is the value of the element that you need to remove
(2) display the new linkedlist after removal
Example 1:
input:1,2,3,4,5,2
output:head-->1-->3-->4-->5-->null
Explanation: The original linkedlist is 1-->2-->3-->4-->5.
The value to remove is 2.
After removing all the nodes that value equals 2, the linkedlist is 1->3->4->5 
Please complete the following program to fullfil the function.
*/
import java.util.*;
public class homework20_4
{
   public static void main(String[] args)
   {
	   LinkedList list = new LinkedList();
	   Scanner sc = new Scanner(System.in);
	   System.out.println("please enter the head value");
	   list.head = new ListNode(sc.nextInt());
	   System.out.println("please enter the second value");
	   ListNode second = new ListNode(sc.nextInt()); list.head.next = second; 
	   System.out.println("please enter the thrid value");
	   ListNode thrid = new ListNode(sc.nextInt()); second.next = thrid; 
	   System.out.println("please enter the fourth value");
	   ListNode fourth = new ListNode(sc.nextInt()); thrid.next = fourth;
	   System.out.println("please enter the fifth value");
	   ListNode fifth = new ListNode(sc.nextInt()); fourth.next = fifth;
	   System.out.println("please enter the value you want removed");
	   int target = sc.nextInt();  sc.close();
	  
	   removeElements(list,target);
	   System.out.println(list);
   }
   public static void removeElements(LinkedList llist, int val)
   {
	   ListNode ref1 = llist.head, ref2 = llist.head;
		  
	   
	   while(ref1 != null)
	   {
		   if(ref1.value == val && ref1 == llist.head) { llist.head = llist.head.next; ref1 =  llist.head;}
		   else if(ref1.value == val) 
		   {
			   try { ref2.next = ref2.next.next; }	catch(Exception E) { ref2.next = null; } 
			   ref1 = ref2.next;
		   }
		   else { ref2 = ref1;	ref1 = ref1.next; }
	   }
   }

   

}
class ListNode
{
   int value;
   ListNode next;
   ListNode(int v){value = v;}
}
class LinkedList
{
   ListNode head;
   public String toString()
   {
      String nodeData = "";
      ListNode ref = head;
      while(ref != null)
      {
         nodeData += ref.value + "-->";
         ref = ref.next;
      }
      return "head-->"+nodeData+"null";
   }
}