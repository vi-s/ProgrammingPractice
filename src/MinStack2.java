//min stack with O(1) pushes and pops

public class MinStack2 extends Stack{
	Stack s2;
	
	public MinStack2(){
		s2 = new Stack();
	}
	
	public void push(int val){
		if(val <= min()) s2.push(val);
		
		super.push(val);
	}
	
	public int pop(){
		int val = super.pop();
		
		if(val == min()) s2.pop();
		return val;
	}
	
	public int min(){
		if(s2.isEmpty()) return Integer.MAX_VALUE;
		else return s2.peek();
	}
	
}
