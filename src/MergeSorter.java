
public class MergeSorter {
	
	void mergesort(int[] array){
		int[] helper = new int[array.length];
		mergesort(array, helper, 0, array.length-1);
	}
	
	void mergesort(int[] array, int[] helper, int low, int high){
		if(low < high){
			int mid = (low + high)/2;
			mergesort(array, helper, low, mid);
			mergesort(array, helper, mid+1, high);
			merge(array, helper, low, mid, high);
		}
	}
	
	void merge(int[] array, int[] helper, int low, int mid, int high){
		for(int i=low; i<= high; i++){
			helper[i] = array[i];
		}
		
		int helperLeft = low;
		int helperRight = mid + 1;
		int current = low;
		
		while(helperLeft <= mid && helperRight <= high){
			if(helper[helperLeft] <= helper[helperRight]){
				array[current] = helper[helperLeft];
				helperLeft++;
			}else{ //right element is smaller than left
				array[current] = helper[helperRight];
				helperRight++;
			}
			current++;
		}
		
		//copy rest of left side into target array.
		int remaining = mid - helperLeft;
		for(int i=0; i<= remaining; i++){
			array[current+i] = helper[helperLeft + i];
		}
		
	}
	
}
