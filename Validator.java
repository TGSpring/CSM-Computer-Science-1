/**
//***********************************************************************
'Project: Assignment 04
'Programmer: Tyler Spring
'Company Info:  tgspring@mylearning.csmd.edu  
'Date: 1 04 2017
'Description:  Problem Number 02.  
'    
'   Charge account program
'   Asks user to enter number
'   Tests whether the number is valid.
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
public class Validator {
	/**
	 * The array that will be used to test against the inputed number from user
	 */
	private static int[] valid = {5658845, 4520129, 7895123, 8777541, 8451277,
			1302850, 8080152, 4562555, 5552012, 5050552, 
			7825877, 1250255, 1005231, 6545231, 3852085, 
			7576651, 7895122, 7881200, 4581002};

	/**
	 * @param number
	 * @return whether the inputed number is valid or not by doing
	 *  a sequential search
	 */
	public boolean isValid(int number){
		for(int index = 0; index < valid.length; index++)
		{
			if (number == valid[index]) 
			{
				return true;

			}
		}
		
		return false;
		
	};

}
