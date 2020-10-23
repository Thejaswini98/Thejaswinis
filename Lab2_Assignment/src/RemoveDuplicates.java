/**
 * 
 * @author Thejaswini 
 * Desc : To remove duplicates and return resulting array
 *
 */
public class RemoveDuplicates 
{ 
	public static void main (String[] args)  
    { 
        int arr[] = {10, 20, 30, 34, 68, 33, 42, 50, 50}; 
        int n = arr.length; 
          
        n = modifyArray(arr, n);
        for (int i=0; i<n; i++) 
           System.out.print(arr[i]+" "); 
    } 
    static int modifyArray(int arr[], int n) 
    { 
    	int j = 0; 
        if (n == 0 || n == 1) 
            return n;
        for (int i = 0; i < n-1; i++) 
            if (arr[i] != arr[i+1]) 
                arr[j++] = arr[i]; 
       
        arr[j++] = arr[n-1]; 
       
        return j; 
    } 
} 
   