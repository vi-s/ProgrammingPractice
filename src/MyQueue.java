
public class MyQueue {
	Stack oldStack; //old elements on top
	Stack newStack; //new elements on top
	
	public MyQueue(){
		oldStack = new Stack();
		newStack = new Stack();
	}
	
	public void enqueue(int v){
		newStack.push(v);
	}
	
	//move elements from new stack to old stack
	private void shiftStacks(){
		if(oldStack.isEmpty()){
			while(!newStack.isEmpty()){
				oldStack.push(newStack.pop());
			}
		}
	}
	
	public int peek(){
		shiftStacks();
		return oldStack.peek();
	}
	
	public int dequeue(){
		shiftStacks();
		return oldStack.pop();
	}
	
	public int size(){
		return oldStack.size + newStack.size;
	}
	
	
}
