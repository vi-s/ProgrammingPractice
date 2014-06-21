
public class Queue {
	Node first, last;
	
	void enqueue(Object item){
		if(first == null){
			first = new Node((int) item);
			last = first;
		}else{
			last.next = new Node((int) item);
			last = last.next;
		}
	}
	
	Object dequeue(){
		if(first!=null){
			Object item = first.data;
			first = first.next;
			return item;
		}
		return null;
	}
	
}
