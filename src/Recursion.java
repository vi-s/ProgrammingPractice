
public class Recursion {

	public static String reverseString(String s){
		if(s.length() == 1) return s;
		return reverseString(s.substring(1,s.length())) + s.charAt(0);
	}
	
	//iterative impl
	
	public static String reverseStringv2(String s){
		String newStr = "";
		for(int i=s.length()-1; i>=0; i--){
			newStr += s.charAt(i);
		}
		return newStr;
	}
	
	public static int maxInt(int[] arr, int idx, int max){
		if(idx == arr.length) return max;
		if(arr[idx] > max) max = arr[idx];
		return maxInt(arr, idx+1, max);
	}

	
    public static int twoTwoA(Node head, int k){
    	if(head == null) return 0;
    	int i = twoTwoA(head.next, k) + 1;
    	if(i == k) System.out.println(head.data);
    	return i;
    }
	
	public static void main(String[] args){
		String s = "super";
		System.out.println(reverseString(s));

		int[] arr = {1,2,3,41, 123, 3};
		System.out.println(maxInt(arr, 0, 0));
		
	}
	
}
