import java.util.Scanner;
public class homework20_1
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
	   sc.close();

	   deleteDuplicates(list);   
	   System.out.println(list);
   }
   /**
    * uses two wile loops to runs through a provided LinkedList and deletes duplicates
    * @param llist the LinkedList that will be edited
    */
   public static void deleteDuplicates(LinkedList llist)
   {
	   ListNode ref1 = llist.head, ref2 = null;
	  
	   while(ref1 != null && ref1.next != null)
	   {
		   ref2 = ref1;
		   while(ref2.next != null)
		   {
		   		if(ref1.value == ref2.next.value) {
		   			try { ref2.next = ref2.next.next;  }
		   			catch(Exception E) { ref2.next = null; } }
		   		else { ref2 = ref2.next; }
		   }
		   ref1 = ref1.next;
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