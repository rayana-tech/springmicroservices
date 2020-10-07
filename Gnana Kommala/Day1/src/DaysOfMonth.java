import java.time.YearMonth;

public class DaysOfMonth {
	public static void main(String[] args) {
	
	YearMonth yearMonthObject = YearMonth.of(2000, 2);
	int daysInMonth = yearMonthObject.lengthOfMonth();
	System.out.println("No of days in that month:::"+daysInMonth);
	}
}
