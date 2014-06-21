
public class Fibonacci {

	static int fibonacci(int i){
		if(i==0) return 0;
		if(i==1) return 1;
		return fibonacci(i-1) + fibonacci(i-2);
	}
	
	static int fibonacciv2(int i){
		int[] arr = new int[i+1];
		for(int j=0; j<=i; j++){
			if(j==0) arr[0] = 0;
			else if(j==1) arr[1] = 1;
			else arr[j] = arr[j-1] + arr[j-2];
		}
		return arr[i];
	}
	
	public static void main(String[] args){
		System.out.println(fibonacci(10));
	}
	
}
