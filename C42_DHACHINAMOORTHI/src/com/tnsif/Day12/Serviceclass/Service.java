package com.tnsif.Day12.Serviceclass;

import java.io.InvalidClassException;

public class Service   {
		
		
		public static boolean validateMarks(int[] marks) throws InvalidClassException {
			for(int ele:marks)
			{
				if (ele<0 || ele>100)
					throw new InvalidClassException("Marks should be between 0 to 100");
			}
			return true;
			
		}
		public static float calculatePercentage(int[] marks)
		{
			int total=0;
			for(int value:marks)
				total+=value;
			float per=total/marks.length;
			return per;
			
		}

	}

}
