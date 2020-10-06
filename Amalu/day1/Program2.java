package Assignemnet1;

public class Program2 {

	public static void main(String[] args) {
		String inputStr="hello world";
		
		String inputstrarr[] = inputStr.split("");
		//System.out.println(inputstrarr.length);
		//int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};  
        //Array fr will store frequencies of element  
        int [] fr = new int [inputstrarr.length];  
        //int visited = -1;  
        for(int i = 0; i < inputstrarr.length; i++){  
            int count = 1;  
            for(int j = i+1; j < inputstrarr.length; j++){  
            	System.out.println(inputstrarr[i]+inputstrarr[j]);
                if(inputstrarr[i].equals(inputstrarr[j]))
                		{ 
                	System.out.println(inputstrarr[i]+inputstrarr[j]);
                    count++;  
                    //To avoid counting same element again  
                    fr[j] = -1;  
                }  
            }  
             if(fr[i]!=-1)
                fr[i] = count;  
        }  
  
        //Displays the frequency of each element present in array  
        System.out.println("---------------------------------------");  
        System.out.println(" Element | Frequency");  
        System.out.println("---------------------------------------");  
        for(int i = 0; i < fr.length; i++){  
            if(fr[i] != -1)  
                System.out.println("    " + inputstrarr[i] + "    |    " + fr[i]);  
        }  
       
		

}
}
