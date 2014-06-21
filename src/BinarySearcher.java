
public class BinarySearcher {
	
	static int binarySearch(int[] a, int x){
		int low = 0;
		int high = a.length - 1;
		int mid;
		
		while(low <= high){
			mid = (low + high) / 2;
			if(a[mid] < x){
				low = mid + 1;
			} else if(a[mid] > x){
				high = mid - 1;
			} else{
				return mid;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5};
		int idx = binarySearch(arr, 4);
		System.out.println(idx);
	}
	
}
