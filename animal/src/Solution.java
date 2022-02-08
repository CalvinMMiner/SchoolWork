class Node

	{

		int value;

     	Node next;

     	Node(int val, Node n){this.value = val; this.next = n;}

     	Node(int val){this.value = val; this.next = null;}
     
     	Node(){this.value = 0; this.next = null;}

	}

	class SinglyLinkedList

	{         Node head;         }

public class Solution{

		public static void main(String[] args){

                             //assume you have following singly linked list and the value you want to remove is 6

                             //empty list, named list1

                             //6->2->6->3->4->6, named list2
		SinglyLinkedList list1 = new SinglyLinkedList();
		SinglyLinkedList list2 = new SinglyLinkedList();
		list2.head = new Node(6); 
		list2.head.next = new Node(2);
		list2.head.next.next = new Node(6);
		list2.head.next.next.next = new Node(3);
		list2.head.next.next.next.next = new Node(4);
		list2.head.next.next.next.next.next = new Node(6);
		
		display(removeNode(list1.head, 6));
        display(removeNode(list2.head, 6));

	}

	public static void display(Node head){

		if(head == null) System.out.println(" ");

		else{

    	while(head!=null){

    	System.out.print(head.value+ "->");

    	head = head.next;}

    }

              }

	public static Node removeNode(Node head, int val)

	{	
		if(head == null) {return head;} else {	
		Node temp1 = head; 
		while(temp1.next != null)
		{
			Node temp2 = temp1.next;
			if(temp1.value == val) 
				{
				temp1.value = temp2.value;
				temp1.next = temp1.next.next;
				}
			else if(temp2.value ==val)
			{
				try { temp1.next = temp1.next.next;  }
	   	     	catch(Exception E) { temp1.next = null; } }
			
			else { temp1 = temp1.next; }
		}
		return head;
		}
	}

}