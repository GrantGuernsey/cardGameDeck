//**********************
//* Grant Guernsey     *
//* Period D           *
//* Lab 10.1           *
//**********************

import java.util.ArrayList;
public class deckRunner
{
	public static void main(String [] args)
	{
		deck d1 = new deck();
		d1.deckFill();
		d1.deckShuffle();
		d1.printCards();
	}
}