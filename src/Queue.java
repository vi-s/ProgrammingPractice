
public class Queue {
	Node first, last;
	
	void enqueue(Object item){
		if(first == null){
			first = new Node((Integer) item);
			last = first;
		}else{
			last.next = new Node((Integer) item);
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
