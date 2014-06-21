//min stack, where pop is not guarenteed O(1) time complexity
//but space complexity is O(1)

public class MinStack1 extends Stack{
	static Node min;
	
	void push(int item){
		Node t = new Node(item);
		t.next = top;
		top = t;
		
		if(min == null) min = top;

		if(top.data < min.data) min = top;	
	}
	
	//finds new min when the top == current min of stack
	int pop(){	
		if(top == null) return -1;
		
		//reset min in case top is min
		if(top == min){
			Node probe = top.next;
			int curMin = 9999999;
			
			while(probe != null){
				if(probe.data < curMin){
					curMin = probe.data;
					min = probe;
				}
				probe = probe.next;
			}
		}
		
		int item = top.data;
		top = top.next;
		return item;	
	}
	
	void printStack(){
		Node probe = top;
		while(probe!=null){
			System.out.println(probe.data);
			probe = probe.next;
		}
		
	}
	
	int min(){
		return min.data;
	}
}
