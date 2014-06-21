
public class StackSorter {
	
	Stack temp;
	
	public StackSorter(){
		temp = new Stack();
	}
	
	public Stack sortStack(Stack s){
		while(!s.isEmpty()){
			if(temp.isEmpty()){
				temp.push(s.pop());
			}
			
			int popped = s.pop();
			
			if(popped <= temp.peek()){
				s.push(temp.pop());
				temp.push(popped);
			}

			temp.push(s.pop());
		}

		return temp;
	}
	
	public Stack sortStackv2(Stack s){
		Stack r = new Stack();
		while(!s.isEmpty()){
			int tmp = s.pop();
			while(!r.isEmpty() && r.peek() > tmp){
				s.push(r.pop());
			}
			r.push(tmp);
		}
		return r;
	}
	
	
	
	
}
