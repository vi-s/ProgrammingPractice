import java.util.Arrays;
import java.util.HashMap;



public class TestingGround {

	public static String isInteresting(String s){
		int length = s.length();
		int furthestIdx = -1;
		boolean atLeastOne = false;
		
		for(int i=0; i<length; i++){
			int x = Integer.parseInt(s.substring(i,i+1));
			int delta = x+1+i;
			
			if(delta < s.length() && delta>furthestIdx){
				int y = Integer.parseInt(s.substring(delta,delta+1));
				System.out.println("x:"+x+"y:"+y);
				if(x != y) return "Not Interesting";
				furthestIdx = delta;
				atLeastOne= true;
			}
		}
		
		return atLeastOne ? "Interesting" : "NotInteresting";
	}	
	
	public static String reverseSentence(String s){
//		String[] arr = s.split(" ");
//		for(int i=0; i<arr.length/2; i++){
//			String tmp = arr[i];
//			arr[i] = arr[arr.length-1-i];
//			arr[arr.length-1-i] = tmp;
//		}
//		String res = "";
		String result = "";
		int idx = 0;
		
		while(idx <= s.length()){
			int spaceIdx = s.indexOf(' ', idx);
			if(spaceIdx == -1){
				result = s.substring(idx, s.length()) + result;
				break;
			}
			
			result =  " " + s.substring(idx,spaceIdx) + result;
			idx = spaceIdx + 1;
		}
		
		return result;
	}
	
	public static String reverseInPlace(String s){
		int len = s.length();
		for(int i=0; i<len/2; i++){
			int swapIdx = len - 1 - i;
			s = s.substring(0,i) + s.substring(swapIdx, swapIdx+1) + 
					s.substring(i+1, swapIdx) + s.substring(i,i+1) + 
					s.substring(swapIdx+1,len);
		}
		return s;
	}
	
	public static String removeDuplicate(String s){
		char[] chars = new char[256];
		char[] sChars = s.toCharArray();
		int idx = 0;
		
		for(char c : sChars){
			if(chars[c]==0){
				chars[c]=1;
				for(int i=idx+1; i<sChars.length; i++){
					if(sChars[i]==c) sChars[i]= 0;
				}
			}
			idx++;
		}
		
		String result = "";
		
		for(char c : sChars){
			if(c != 0){
				result += c;				
			}
		}
		
		return result;	
	}
	
	public static void main(String[] args){
		//3.2
//		MinStack2 stack1 = new MinStack2();
//		stack1.push(10);
//		stack1.push(5);
//		stack1.push(0);
//		stack1.pop();
//		System.out.println(stack1.min());

		//3.3
//		SetOfStacks set = new SetOfStacks(2);
//		set.push(1);
//		set.push(2);
//		set.push(3);
//		System.out.println(set.pop());
//		System.out.println(set.pop());
		
		
//		StackSorter sorter = new StackSorter();
//		Stack s1 = new Stack();
//		s1.push(10);
//		s1.push(1);
//		s1.push(11);
//		s1 = sorter.sortStack(s1);
//		s1.printStack();
		
//		HashMap<String, Integer> map = new HashMap<String, Integer>();
//		map.put("s", 1);
//		System.out.println(map.get("s"));
//		
		
//		int c = 1235;
//		String numStr = "" + c;
		
//		System.out.println(new Integer(1).toString());
		
//		System.out.println(isInteresting("611"));
//		int[] arr = {100,200,300,400,500,600};
//		System.out.println(include(arr, 2000));

//		System.out.println(removeDuplicate("AAA BB"));

    }
	
}
