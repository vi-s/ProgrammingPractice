
public class RandomStuff {

	public static int convertBase(int v, int base){
		int converted = 0;
		int multiplier = 1;
		
		while(v>0){
			converted += (v%base) * multiplier;
			v /= base;
			multiplier *= 10;
		}
		
		return converted;
	}
	
	public static boolean twoSum(int[] arr, int v){
		int i = 0;
		int j = arr.length - 1;
		
		while(i<j){
			int workingSum = arr[i] + arr[j];
			if(workingSum == v) return true;
			else{
				if(workingSum > v) j--;
				else i++;
			}
		}
		
		return false;
		
	}
	
//	50 base 3 ,512
	
	public static void main(String[] args){
		System.out.println(convertBase(50, 2));
		int[] arr = {1,2,3,4,5,6};
		System.out.println(twoSum(arr, 3));
	
	}
	
}
