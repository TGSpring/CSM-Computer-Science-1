/**
//***********************************************************************
'Project: Assignment 04
'Programmer: Tyler Spring
'Company Info:  tgspring@mylearning.csmd.edu  
'Date: 2 04 2017
'Description:  Problem Number 04.  
'    
'   Element swapping program.
'   Takes the elements of an array and swaps them.
'   Calls method to output array with swapped elements.
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
 
class TGS_P04 {

	public static void main(String[] args) {
		double[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		printArray(inputArray);
		swap(4, inputArray);
		System.out.println("Swap 4 & 5");
		printArray(inputArray);
		System.out.println("Swap 8 & 9");
		swap(8, inputArray);
		printArray(inputArray);
		System.out.println("Swap 1 & 2");
		swap(1, inputArray);
		printArray(inputArray);
		
	}
	
	/**
	 * @param The method that swaps the elements of the inputArray.
	 */
	public static void swap(int k, double [] input){
		if (k == 4)
		{
			int swap1 = 3;
			int swap2 = 4;
			double swap3 = input[swap1];
			input[swap1] = input[swap2];
			input[swap2] = swap3;
		} else if (k == 8) {
			int swap1 = 7;
			int swap2 = 8;
			double swap3 = input[swap1];
			input[swap1] = input[swap2];
			input[swap2] = swap3;
		} else {
			int swap1 = 0;
			int swap2 = 1;
			double swap3 = input[swap1];
			input[swap1] = input[swap2];
			input[swap2] = swap3;
		}
			
	}
	
	/**
	 * @param The method that prints of inputArray with the swapped elements.
	 */
	public static void printArray(double[] inputArray){
		int max = 5;
		System.out.println("The Array elements are: \n");
		System.out.println("\t\t");
		for (int i = 0; i <= inputArray.length - 1; i++)
		{
			System.out.printf("%5.2f \t\t", (inputArray[i]));
			max--;
			if (max == 0)
			{
				max = 5;
				System.out.println();
			}
		}
		System.out.println("\n");
	}
	
}
