package practice4G;

import java.util.*;

public class MergeSortLinkedList {
	
	public Node head;

	public static void main(String args[]) {
		
		MergeSortLinkedList ms = new MergeSortLinkedList();
		ms.add(3);
		ms.add(1);
		ms.add(2);
		ms.add(4);		
		ms.add(71);
		ms.add(95);
		ms.add(329);
		ms.add(70);
		ms.add(93);
		ms.add(392);
		ms.add(45);
		ms.add(89);
		
		ms.mergeSortLists();
		ms.printList();
	}
	
	public void mergeSortLists() {
		
		Node n = head;
		head = mergeSort(n);
	}
	
	public Node mergeSort(Node n) {
		Node temp = n, slow, fast;
		
		if(n == null || n.next == null) {
			
			return n; 
		} else {
			slow = n;
			fast = n.next;
			
			while(fast != null) {
				fast = fast.next;
				if(fast != null) {
					slow = slow.next;
					fast = fast.next;
				}
			}
			
			fast = slow.next;
			slow.next = null;
			slow = temp;
		}

		return merge(mergeSort(slow),mergeSort(fast));
	}
	
	public Node merge(Node slow, Node fast) {
		Node result = null;
		
		if(slow == null)
			return fast;
		else if(fast == null)
			return slow;
		
		if(slow.data <= fast.data) {
			result = slow;
			result.next = merge(slow.next, fast);
			
		} else {
			result = fast;
			result.next = merge(slow, fast.next);
		}
		
		return result;
	}
	
	public void add(int data) {
		if(head == null) {
			head = new Node(data);
		} else {
			Node n = new Node(data);
			n.next = head;
			head = n;
		}
	}
	
	public void printSublist(Node n) {
		Node m = n;
		while(m != null) {
			System.out.println(m.data);
			m = m.next;
		}
	}
	
	public void printList() {
		while(head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}
}
