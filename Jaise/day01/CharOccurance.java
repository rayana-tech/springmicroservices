package DayOne;

public class CharOccurance {
	
	private void countEachChar(String str) {
		char[] stringArr;
	    do{
	      stringArr = str.toCharArray();
	      char chrtr = stringArr[0];
	      int count = 1;
	      for(int i = 1; i < stringArr.length; i++){
	        if(chrtr == stringArr[i]){
	          count++;
	        }
	      }
	      
	      if(((chrtr != ' ') && (chrtr != '\t'))){
	        System.out.println(chrtr + " ..... " + count);
	      }
	      str = str.replace(""+chrtr, "");
	    }while(stringArr.length > 1);    
	  }
		

	public static void main(String[] args) {
		CharOccurance cc = new CharOccurance();
	    cc.countEachChar("hello word");

	}

}
