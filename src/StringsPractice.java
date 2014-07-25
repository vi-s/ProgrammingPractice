
//Ch1 of CCI

public class StringsPractice {

    public static boolean oneOne(String s){
    	int[] all = new int[256];
    	for(int i=0; i<s.length(); i++){
    		if(++all[(int) s.charAt(i)] > 1) return false;
    	}
    	return true;
    }
	
    public static boolean oneThree(String s1 ,String s2){
        return sortString(s2).equals(sortString(s1));
    }
	
    public static String sortString(String s){
        char[] content =  s.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }
    
    public static String oneFour(String s){
        char[] content = s.toCharArray();
        int ctr = 0;
        
        for (char x : content) if(x == ' ') ctr++;
        
        char[] newContent = new char[s.length() + (2*ctr)];
        
        ctr = 0;
        
        for(char x: content){
        	if(x == ' '){
        		newContent[ctr++] = '%';
        		newContent[ctr++] = '2';
        		newContent[ctr++] = '0';
        	}else newContent[ctr++] = x;
        }
        
        return new String(newContent);
    }
    
    public static String oneFive(String s){
    	int ctr = 0;
    	String str = new String();
    	
    	for(int i=0; i<s.length(); i++){
    		ctr++;
    		if (i+1 < s.length()-1 && s.charAt(i) != s.charAt(i+1)){
    			str += "" + s.charAt(i) + ctr;
    			ctr = 0;
    		}else if(i==s.length()-1){
    			str += "" + s.charAt(i) + ctr;
    		}
    	}
    	return str;
    }
    
    public static int[][] oneSeven(int[][] matrix){
    	for(int i = 0; i < matrix.length ; i++){
    		for(int j = 0; j<matrix[0].length ; j++){
    			if(matrix[i][j] == 0){
    				for(int i2=0; i2<matrix.length; i2++) matrix[i2][j] = 0;
    				for(int j2=0; j2<matrix[0].length; j2++) matrix[i][j2] = 0;
    			}
    		}
    	}
    	
    	return matrix;
    }
    
    
    //***further study
    
    public static int[][] oneSix(int[][] matrix, int n){
    	for(int layer=0; layer < n/2; layer++){
    		int first = layer;
    		int last = n-1-layer;
    		
    		for(int i=first; i<last; i++){
    			int offset = i - first;
    			//save top
    			int top = matrix[first][i];
    			//left -> top
    			matrix[first][i] = matrix[last-offset][first];
    			//bottom -> left
    			matrix[last-offset][first] = matrix[last][last-offset];
    			//right -> bottom
    			matrix[last][last-offset] = matrix[i][last];
    			//top -> right
    			matrix[i][last] = top;
    		}
    	}
    	
    	
    	return null;
    }
    
    public static boolean oneEight(String s1, String s2){
//    	return isSubstring((s1+s1),s2);
    	return false;
    }

    public static String reverseString(String s){
        return null;
    }
    
    
    
}
