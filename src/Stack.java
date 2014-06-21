
public class Stack{
	Node top;
	int size;
	
	public Stack(){
		size = 0;
		top = null;
	}
	
	void push(int item){
		Node t = new Node(item);
		t.next = top;
		top = t;
		size++;
	}

	int pop(){	
		if (top == null) return -1;
		
		int item = top.data;
		top = top.next;
		size--;
		return item;		
	}
	
	int peek(){
		return top.data;
	}
	
	boolean isEmpty(){
		return top == null;
	}
	
	void printStack(){
		Node probe = top;
		while(probe!=null){
			System.out.println(probe.data);
			probe = probe.next;
		}
		
	}
		
}
