package DayOne2;

public class SumOfDigits {
	
	static int sumDigits(int no) 
    { 
        return no == 0 ? 0 : no%10 + sumDigits(no/10) ; 
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 687; 
		System.out.println(sumDigits(num)); 
	}

}
