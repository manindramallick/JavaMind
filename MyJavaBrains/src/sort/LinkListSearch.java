package sort;

public class LinkListSearch {

	
	public static class Node{
		
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
		
	}
	
	Node head;
	
	public void push(int data) {
		Node newnode= new Node(data);
		newnode.next=head;
		head = newnode;
	}
	
	public void printNthElement(int n) {
		
		Node first = head;
		Node slow = head;
		int start =1;
		while(first.next!=null) {
			first =first.next;
			start++;
			
			if(start>n) {
				slow = slow.next;
			}
		}
			System.out.println(slow.data);
			
			
		}
		
		
		
		
		
	
	
	public static void main(String[] args) {
		
		LinkListSearch linkListSearch = new LinkListSearch();
		linkListSearch.push(1);
		linkListSearch.push(2);
		linkListSearch.push(3);
		linkListSearch.push(7);
		linkListSearch.push(6);
		linkListSearch.push(9);
		linkListSearch.push(10);
		linkListSearch.push(4);
		linkListSearch.printNthElement(2);

	}

}
