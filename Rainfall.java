/**
//***********************************************************************
'Project: Assignment 04
'Programmer: Tyler Spring
'Company Info:  tgspring@mylearning.csmd.edu  
'Date: 3 04 2017
'Description:  Problem Number 01.  
'    
'   Rain fall program.
'   Passes and copies new array.
'   Finds total, average, highest, lowest.
'
'	--------------------------------------------------------------------------
'   							HONOR CODE: 
'	I pledge that this program represents my own program code, I have received 
'	help from no one and I have given help to no one.
'	
'								OR
'
'	I received help from NO ONE in designing and debugging my program.
'	I given help to NO ONE in designing and debugging my program.
'-----------------------------------------------------------------------------
'
'  LINE LENGTH - AVOID LINES LONGER THAN 80 CHARACTERS
'  SCALE BELOW IS TO CALIBRATE SCREENSHOTS
'  DO NOT HAVE YOUR CODE OR SCREENSHOT EXTEND BEYOND THE SCALE
0........1.........2.........3.........4.........5.........6.........7.........8
12345678901234567890123456789012345678901234567890123456789012345678901234567890
*/
public class Rainfall {

	/**
	 * creating new array to copy over and use in this class. 
	 */
	private double [] rain;
	
	public Rainfall(double r[])
	{
		rain = new double[r.length];
		
		for(int i = 0; i < r.length; i++)
			rain[i] = r[i];
	}
	
	/**
	 * @return the calculated total of all the numbers in the array.
	 */
	public double getTotalRainFall()
	{
		double totalRainfall = 0;
		for (int index = 0; index < rain.length; index++)
		{
			totalRainfall += rain[index];
		}
		
		return totalRainfall;
	}
		
		/**
		 * @return calculates and returns the average of all of the numbers 
		 * in the array.
		 */
		public double getAverageRainfall()
		{
			double averageRain = 0;
			double average = 0;
			for (int index = 0; index < rain.length; index++)
			{
				averageRain += rain[index];
				average = averageRain / rain.length;
			}
			return average;
		}
		
		/**
		 * @return finds the largest number in the array and returns its index.
		 */
		public int getHighestMonth()
		{
			double highest = rain[0];
			int number = 0;
			for (int index = 0; index < rain.length; index++)
			{
				if (rain[index] > highest) {
					highest =  rain[index];
					number = index + 1;
			
				}
			}
		return number;
		}
		
		/**
		 * @return finds the smallest number in the array and returns its index.
		 */
		public int getLowestMonth()
		{
			double lowest = rain[0];
			int number = 0;
			for (int index = 0; index < rain.length; index++)
				{
					if (rain[index] < lowest) {
					lowest =  rain[index];
					number = index + 1;
				}
		}
				
		return number;
		}
		
		/**
		 * @return stores all the names of the months.
		 */
		public static String[] months()
		{
			String[]_months = {"January", "February", "March", "April", 
		"May", "June", "July", "August", "September",
		"October", "November", "December"};
		return _months;
		}

		/*
		 * (non-Javadoc)
		 * Creates the output
		 * @see java.lang.Object#toString()
		 */
	public String toString() {
		String str;
			for (int index = 0; index < 12; index++)
		{
				System.out.printf(months()[index]  + "\t\t" + rain[index] 
				+ "\n");
		}
		str = "The total rainfall for this year is: " + 
		String.format("%5.2f\n", getTotalRainFall());
		str += "The average rainfall for this year is: " +
		String.format("%5.2f\n", getAverageRainfall());
		str += "The number of the month with the highest amount of rain is: "
		+ (getHighestMonth() + "\n");
		str += "The number of the month with the lowest amount of rain is: "
		+ (getLowestMonth() + 1);

		return str;
	}
}