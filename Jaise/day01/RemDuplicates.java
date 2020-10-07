package DayOne;

public class RemDuplicates {
	
	public static int removeDuplicate(int arr[], int num){  
        if (num==0 || num==1){  
            return num;  
        }  
        int[] temp = new int[num];  
        int j = 0;  
        for (int i=0; i<num-1; i++){  
            if (arr[i] != arr[i+1]){  
                temp[j++] = arr[i];  
            }  
         }  
        temp[j++] = arr[num-1];      
        for (int i=0; i<j; i++){  
            arr[i] = temp[i];  
        }  
        return j;  
    }  

	public static void main(String[] args) {
		int arr[] = {10,20,20,30,30,40,50,50};  
        int arrLength = arr.length;  
        arrLength = removeDuplicate(arr, arrLength);  
        for (int i=0; i<arrLength; i++)  
           System.out.println(arr[i]+" ");  
    }  

	

}
