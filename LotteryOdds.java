/*Programming Assignment 7
 * Author: L Castro
 * Date: 3/4/2023
 * Purpose: Write a program that calculates the odds of winning the lottery
*/
package LotteryOdds;

import javax.swing.*;
import java.text.*;

public class LotteryOdds 
{

	public static void main(String[] args) 
	{
		// Declare and initialize variables.
		long lngOdds1 = 1, 
			 lngOdds2 = 1,
			 lngTotalOdds = 1;
		
		short shtNums = 0,
			  shtMax = 0;
		
		String sTotalOdds = "";
		
		//Prompt the user for a maximum number and a number pick
		shtMax = Short.parseShort(JOptionPane.showInputDialog("Enter the maximum numbers in this game: "));
		shtNums = Short.parseShort(JOptionPane.showInputDialog("Enter the total numbers to be selected: "));
		
		//Write a one loop to determine the first and second part of the lottery odds calculation. 
		while (shtNums > 0)
		{
			lngOdds1 *= shtMax;//Assign the value of the first part of the calculation to a variable
			shtMax--;
			
			lngOdds2 *= shtNums;//Assign the value of the second part of the calculation to a variable
			shtNums--;
			
		}
		//Calculate odds by dividing the first part (lngOdds1) by the second part (lngOdds2)
		lngTotalOdds = lngOdds1 / lngOdds2 ;//Assign the quotient to a variable
		
		//Format lngTotalOdds to seperate number with commas
		sTotalOdds = NumberFormat.getInstance().format(lngTotalOdds);
		
		//Output 
		JOptionPane.showMessageDialog(null,
					      "The odds of winning this game: " + sTotalOdds,
					      "Lottery Odds",
		                	      JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	
	}//end of main method

}//end of LotteryOdds class
