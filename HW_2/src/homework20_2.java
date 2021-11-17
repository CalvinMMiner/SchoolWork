/*
In this program, you need to merge two sorted linked lists 
and return it as a new list. The new list should be made by
splicing together the nodes of the first two lists.
Example 1:
input:1->2->4, 1->3->4
output:head-->1-->1-->2-->3-->4-->4-->null
Please complete the following program to fullfil the function.
*/
import java.util.*;
public class homework20_2
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      //first list
      System.out.println("First list");
      LinkedList llist1 = new LinkedList();
      llist1.head = new ListNode(input.nextInt());
      llist1.head.next = new ListNode(input.nextInt());
      llist1.head.next.next = new ListNode(input.nextInt());
      //second list
      System.out.println("Second list");
      LinkedList llist2 = new LinkedList();
      llist2.head = new ListNode(input.nextInt());
      llist2.head.next = new ListNode(input.nextInt());
      llist2.head.next.next = new ListNode(input.nextInt()); input.close();
      
      LinkedList sortedList = new LinkedList();
      sortedList.head = mergeTwoLists(llist1,llist2);
      System.out.println(sortedList);
   }
   public static ListNode mergeTwoLists(LinkedList llist1, LinkedList llist2)
   {
	   ListNode combo = new ListNode(0); ListNode last = combo;
	   ListNode a = llist1.head; ListNode b = llist2.head;
	   while(true) 
	   {
		   if(a == null) {last.next = b; break;}
		   if(b == null) {last.next = a; break;}
		   
		   if(a.value <= b.value) { last.next = a; a = a.next; }
		   else { last.next = b; b = b.next; }
		   last = last.next;
	   }
     return combo.next;
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