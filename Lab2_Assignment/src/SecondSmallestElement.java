/**
 * 
 * @author Thejaswini
 * Desc : To Get the second smallest element in the array 
 *
 */
public class SecondSmallestElement{  
	public static void main(String args[]){  
		int a[]={1,2,5,6,3,7};  
		  
		System.out.println("Second smallest: "+getSecondSmallest(a));  
		 
		}
public static int getSecondSmallest(int[] a){  
int temp;  
for (int i = 0; i < 5; i++)   
        {  
            for (int j = i + 1; j < 5; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
       return a[1];
}  
}  