/*
Given a linked list, remove the n-th node from the end of the list
and return its head. In this program, you need to 
(1) read 6 numbers, add the first 5 numbers in the linkedlist
the last one is the index of the element that you need to remove
(2) display the new linkedlist after removal
Example 1:
input:1,2,3,4,5,2
output:head-->1-->2-->3-->5-->null
Explanation: The original linkedlist is 1-->2-->3-->4-->5.
The second node from the end is 4.
After removing the second node from the end, the 
linkedlist is 1->2->3->5 
Please complete the following program to fullfil the function.
*/
import java.util.*;
public class homework20_3
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
	   System.out.println("please enter the index of the value you want removed (starts at 0)");
	   int target = sc.nextInt();  sc.close();
	  
	   removeNthFromEnd(list,target);
	   System.out.println(list);
   }
   
   public static void removeNthFromEnd(LinkedList llist, int n)
   {
	   ListNode ref = llist.head;
	   if(n==0) { llist.head = llist.head.next;}
	   for(int a=1;a<n;a++) { ref = ref.next; }
	   if(ref.next != null) { ref.next = ref.next.next; }
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