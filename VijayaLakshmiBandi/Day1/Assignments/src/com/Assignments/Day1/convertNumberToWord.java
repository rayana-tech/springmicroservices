package com.Assignments.Day1;

public class convertNumberToWord {
	static void convert_to_words(char[] num)
	{
		int len = num.length; 
		if (len == 0) 
		{
			System.out.println("empty string");
			return;
		}
		if (len > 4) 
		{
			System.out.println("Length more than 4 is not supported");
			return;
		}

		String[] single_digits = new String[]{ "zero", "one", 
				"two", "three", "four",
				"five", "six", "seven", 
				"eight", "nine"};

		String[] two_digits = new String[]{"", "ten", "eleven", "twelve", 
				"thirteen", "fourteen",
				"fifteen", "sixteen", "seventeen",
				"eighteen", "nineteen"};

		String[] tens_multiple = new String[]{"", "", "twenty", "thirty", "forty", 
				"fifty","sixty", "seventy", 
				"eighty", "ninety"};

		String[] tens_power = new String[] {"hundred", "thousand"};

		System.out.print(String.valueOf(num)+": ");

		/* For single digit number */
		if (len == 1) 
		{
			System.out.println(single_digits[num[0] - '0']);
			return;
		}

		int x = 0;
		while (x < num.length) 
		{

			/* Code path for first 2 digits */
			if (len >= 3)
			{
				if (num[x]-'0' != 0)
				{
					System.out.print(single_digits[num[x] - '0']+" ");
					System.out.print(tens_power[len - 3]+" "); 
					// here len can be 3 or 4
				}
				--len;
			}

			/* Code path for last 2 digits */
			else
			{
				if (num[x] - '0' == 1) 
				{
					int sum = num[x] - '0' + 
							num[x] - '0';
					System.out.println(two_digits[sum]);
					return;
				}
				else if (num[x] - '0' == 2 && 
						num[x + 1] - '0' == 0)
				{
					System.out.println("twenty");
					return;
				}
				else
				{
					int i = (num[x] - '0');
					if(i > 0)
						System.out.print(tens_multiple[i]+" ");
					else
						System.out.print("");
					++x;
					if (num[x] - '0' != 0)
						System.out.println(single_digits[num[x] - '0']);
				}
			}
			++x;
		}
	}

	public static void main(String[] args)
	{
		convert_to_words("1".toCharArray());
		convert_to_words("2".toCharArray());
		convert_to_words("123".toCharArray());
	}
}
