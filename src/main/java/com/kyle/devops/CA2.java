package com.kyle.devops;//com.kyle.devops.CA2.java t00174978
/*this program validates the date of birth
 *entered by the user*/

import javax.swing.*;

public class CA2{
	public static void main(String args[])
	{
		String dob = JOptionPane.showInputDialog("Please enter the date of birth in the form dd-mm-yyyy");
		dobValidator(dob);
	}

	public static boolean dobValidator(String dob) {

		boolean valid;
		int month,day;



		valid = false;

		while(!valid)
		{
			if(dob.length() != 10)
				//dob = JOptionPane.showInputDialog("Invalid! Must have exactly 10 characters - Please re-enter");
				dob = setValidDobIfInvalid();
			else if(dob.charAt(2)==('-') && (dob.charAt(5)==('-')))
			{
				if(Character.isDigit(dob.charAt(0)) && Character.isDigit(dob.charAt(1)))
				{	dob = setValidDobIfInvalid();
					if(Character.isDigit(dob.charAt(3)) && Character.isDigit(dob.charAt(4)))
					{	dob = setValidDobIfInvalid();
						day = Integer.parseInt(dob.substring(0,2));
						month = Integer.parseInt(dob.substring(3,5));

						if(month > 0 && month <=12)
						{

							if((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
									&& (day > 31))
								dob = JOptionPane.showInputDialog("Invalid! Must have <= 31 days in any month - Please re-enter");

							else if((month == 4 || month == 6 || month == 9 || month == 11)
									&& (day > 30))
								dob = JOptionPane.showInputDialog("Invalid! Too many days for this month value - Please re-enter");
							else if(month == 2 && day > 28)
								dob = JOptionPane.showInputDialog("Invalid! Too many days for this month value - Please re-enter");
							else
							{

								//JOptionPane.showMessageDialog(null,"The valid date of birth you supplied is " + dob,"Date of Birth",JOptionPane.INFORMATION_MESSAGE);
								valid = true;
							}

						}
						else
							dob = JOptionPane.showInputDialog("Invalid! Month value must be <= 12 - Please re-enter");

					}
					else
						dob = setValidDobIfInvalid();
						//dob = JOptionPane.showInputDialog("Invalid! Month part must both be digits - Please re-enter");
				}
				else
					dob = setValidDobIfInvalid();
					//dob = JOptionPane.showInputDialog("Invalid! Day part must both be digits - Please re-enter");
			}
			else
			{
				dob = setValidDobIfInvalid();
				//dob = JOptionPane.showInputDialog("Invalid! Must have dashes in the correct locations - Please re-enter");
			}

		}
		return true;
		//System.exit(0);


	}

	public static String setValidDobIfInvalid()
	{
		String dob = "24-11-1992";
		return dob;
	}

}