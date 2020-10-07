package DayOne;

public class AmsrongNum {
	int power(int x, long y) 
    { 
        if( y == 0) 
            return 1; 
        if (y%2 == 0) 
            return power(x, y/2)*power(x, y/2); 
        return x*power(x, y/2)*power(x, y/2); 
    } 
  
    int order(int x) 
    { 
        int num = 0; 
        while (x != 0) 
        { 
            num++; 
            x = x/10; 
        } 
        return num; 
    } 
  
    boolean isArmstrong (int x) 
    { 
        int n = order(x); 
        int temp=x, sum=0; 
        while (temp!=0) 
        { 
            int r = temp%10; 
            sum = sum + power(r,n); 
            temp = temp/10; 
        } 
        return (sum == x); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AmsrongNum armNum = new AmsrongNum(); 
        int x = 153; 
        System.out.println("Number 153 : "+armNum.isArmstrong(x)); 
        x = 1253; 
        System.out.println("Number 1253 : "+armNum.isArmstrong(x));
	}

}
