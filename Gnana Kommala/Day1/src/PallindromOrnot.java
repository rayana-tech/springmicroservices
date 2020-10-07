
public class PallindromOrnot {
	public static void main(String[] args)   
	{  
	int number = 4531238, reverse = 0;  
	while(number != 0)   
	{  
	int remainder = number % 10;  
	reverse = reverse * 10 + remainder;  
	number = number/10;  
	}  
	if(number==reverse)
	System.out.println("Pallindrome");  
	else
		System.out.println("Not pallindrome");  
	}  
}
