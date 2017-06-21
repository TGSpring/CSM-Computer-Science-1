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
public class TGS_P03 {

	public static void main(String[] args) {
		double[] analyzeThese = {75.8, 6.1, 40.5, 43.0, 28.8, 17.7, 
				32.2, 35.3, 125.4, 43.8, 71.1, 23.2, 28.2};
		
		System.out.println(ArrayUtilities.toString(analyzeThese));
	}

}
