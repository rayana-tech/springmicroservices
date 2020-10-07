package DayOne;
import java.util.Arrays;

public class LargestNumInArr {
	
	static int largest(int []arr,int n)  
	{  
		Arrays.sort(arr);  
		return arr[n - 1];  
	}  

	public static void main(String[] args) {
		int []numArr = {10, 20, 45,15, 25, 50};  
		int n = numArr.length;  
		System.out.println("Largest Number in the array given : "+ largest(numArr, n));

	}

}
