import java.util.ArrayList;

public class SetOfStacks {
	int capacity;
	ArrayList<Stack> stacks;
	
	public SetOfStacks(int capacity){
		stacks = new ArrayList<Stack>();
		this.capacity = capacity;
	}
	
	private Stack getLastStack(){
		if(stacks.size() == 0) return null;
		return stacks.get(stacks.size()-1);
	}
	
	public void push(int v){
		if(getLastStack()==null || getLastStack().size == capacity){
			stacks.add(new Stack());
		}
		getLastStack().push(v);
	}
	
	public int getNumStacks(){
		return stacks.size();
	}
	
	public int pop(){
		Stack last = getLastStack();
		if(last != null){
			int popped = last.pop();
			if(last.size == 0) stacks.remove(last);
			return popped;
		}else{
			return -1;
		}
		
	}
	
}
