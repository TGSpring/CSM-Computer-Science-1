/**
//***********************************************************************
'Project: Assignment 04
'Programmer: Tyler Spring
'Company Info:  tgspring@mylearning.csmd.edu  
'Date: 1 04 2017
'Description:  Problem Number 03.  
'    
'   Array Utilities.
'   Displays array 5 elements to a line.
'   Gives size, biggest and smallest, range, sum, and average of array.
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

public class ArrayUtilities {

	/**
	 * Creating new array and copying over the elements with constructor.
	 */
	private static double [] array;
	
	public ArrayUtilities(double a[])
	{
		array = new double[a.length];
		
		for(int i = 0; i < a.length; i++)
			array[i] = a[i];
	}
	
	/**
	 * @param array
	 * @return the sum of the all the elements.
	 */
	public static double calcTotal(double[] array)
	{
		double total = 0;
		for (int index = 0; index < array.length; index++)
		{
			total += array[index];
		}
		
		return total;
	}
		
		/**
		 * @param array
		 * @return the average of all the elements in the array
		 */
		public static double calcAverage(double[] array)
		{
			double average = 0;
			double _average = 0;
			for (int index = 0; index < array.length; index++)
			{
				average += array[index];
				_average = average / array.length;
			}
			return _average;
		}
		
		/**
		 * @param array
		 * @return Finds the largest element in the array
		 */
		public static double calcLargest(double[] array)
		{
			double largest = array[0];
			
			for (int index = 1; index < array.length; index++)
			{
				if (array[index] > largest) {
					largest =  array[index];
				
				}
			}
				
		return largest;
		}
		
		/**
		 * @param array
		 * @return Finds the smallest element in the array.
		 */
		public static double calcSmallest(double[] array)
		{
			double smallest = array[0];
			
			for (int index = 1; index < array.length; index++)
			{
				if (array[index] < smallest) {
					smallest =  array[index];
				
				}
			}
				
		return smallest;
		}
		
		/**
		 * @param array
		 * @return Calculates the range of the array
		 */
		public static double calcRange(double[] array)
		{
			return (calcLargest(array) - calcSmallest(array));
		}
		
		/*
		 * (non-Javadoc)
		 * Creates the output
		 * @see java.lang.Object#toString()
		 */
	public static String toString(double[] array) {
		String str;
		for (int index = 0; index < array.length; index++)
		{
			System.out.printf("%-9s",array[index]);
			if (index == 4 || index == 9){
				System.out.printf("" + "\n");
			}
		}
		str = "\n\nThere are " + array.length + " elements in the array.\n";
		str += "The smallest value in the array is: " + 
		String.format("%1.2f\n", calcSmallest(array));
		str += "The largest value in the array is: " + 
		String.format("%1.2f\n", calcLargest(array));
		str += "The range of the values in the array is: " +
		String.format("%1.2f\n", calcRange(array));
		str += "The sum of the values in the array is: " +
		String.format("%1.2f\n", calcTotal(array));
		str += "The average of the values in the array is: " + 
		String.format("%1.2f\n", calcAverage(array));

		return str;
	}
}

