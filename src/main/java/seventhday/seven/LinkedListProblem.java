package seventhday.seven;

import java.util.Arrays;

import org.junit.Test;

public class LinkedListProblem {
	
	
	
	public class Node {

		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			next=null;
		}

		public Node() {
			// TODO Auto-generated constructor stub
		}

	}
	
	
	public Node add(int data) {
		
		return new Node(data);
	}
	
	
	public void printData(Node node) {
		
		Node next=null;
		while(node!=null) {
			
			System.out.println(node.data);
			node = node.next;
		}
		
	}
	
	public void printOddNode(Node node) {

		Node curr = node, next = null;
		while (curr != null) {

			System.out.println(curr.data);
			curr = node.next.next;

		}

	}
	
	//@Test
     public void actualTest() {
			
		Node head = add(1);
		head.next = add(2);
		head.next.next = add(3);
		
		
		printOddNode(head);
		//printData(head);
			
		
	}
	
	@Test
	public void mergeList() {
		
		Node head = add(1);
		head.next = add(3);
		head.next.next = add(5);
		
		Node head2 = add(2);
		head2.next = add(4);
		head2.next.next = add(6);
		
		mergeSortedList(head,head2);
	}


	private void mergeSortedList(Node head, Node head2) {
		
		
		
		Node head3 = new Node(); 
		Node curr = head3;
		
		while(head.next!=null && head2.next!=null) {
		if(head.data < head2.data)
		{
			curr.next=head;
		head =head.next;}
		else {
			curr.next=head2;
			head2=head2.next;
		}
			
		curr = curr.next;
		
		}
		
		printData(head3.next);
	} 
	
	
}
