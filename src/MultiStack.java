
public class MultiStack {
	final static int stackSize = 100;
	int[] buffer = new int[stackSize*3];
	int[] stackPointer = {-1, -1, -1};
	
	void push(int stackNum, int value) throws Exception{
		if(stackPointer[stackNum] + 1 >= stackSize){
			throw new Exception("Out of space.");
		}
		stackPointer[stackNum]++;
		buffer[absTopOfStack(stackNum)] = value;
	}
	
	int pop(int stackNum) throws Exception{
		if(isEmpty(stackNum)) throw new Exception("This stack's empty");
		int popped = buffer[absTopOfStack(stackNum)];
		stackPointer[stackNum]--;
		return popped;
	}
	
	int peek(int stackNum){
		return buffer[absTopOfStack(stackNum)];
	}
	
	boolean isEmpty(int stackNum){
		return stackPointer[stackNum] == -1;
	}
	
	int absTopOfStack(int stackNum){
		return stackNum*stackSize + stackPointer[stackNum];
	}
}
