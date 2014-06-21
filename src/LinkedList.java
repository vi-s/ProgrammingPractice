
public class LinkedList {
	Node head;
	
	public LinkedList(){
		head = null;
	}
	
	public void addFront(int newData){
		Node temp = head;
		head = new Node(newData);
		head.next = temp;
	}
	
	public void addRear(int newData){
		if(head==null){
			head = new Node(newData);
		}else{
			Node probe = head;
			while(probe.next!=null){
				probe = probe.next;
			}
			probe.next = new Node(newData);			
		}
		
	}
	
	public void printList(){
		Node probe = head;
		
		while(probe != null){
			System.out.println(probe.data);
			probe = probe.next;
		}
	}
	
	public Node getFront(){
		return head;
	}
	
	/**
	 * Always remember to check edge cases,both head and tail.
	 * Check head for null.
	 * Check that tail's next points to null and not somewhere else in the list by accident.
	 */
	
	public void reverse(){
		int ctr = 0;
		Node probe = head;
		
		while(probe!=null){
			ctr++;
			probe = probe.next;
		}
		
		Node[] reversed = new Node[ctr];
		probe = head;
		
		/* Make sure you don't fuck up array bounds 
		 * as in, if you make an array of size 3, the last index is 2, not 3...
		 * */
		
		while(probe!=null){
			reversed[--ctr] = probe;
			probe = probe.next;
		}
		
		for(int i=0; i<reversed.length-1; i++){
			reversed[i].next = reversed[i+1];
		}
		
		reversed[reversed.length-1].next = null;
		head = reversed[0];
	}
	
	public static void main(String[] args){
		LinkedList lst = new LinkedList();
		lst.addRear(1);
		lst.addRear(2);
		lst.addRear(3);
		lst.reverse();
		lst.printList();	
	}
	
}
