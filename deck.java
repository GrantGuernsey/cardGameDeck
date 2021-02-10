//**********************
//* Grant Guernsey     *
//* Period D           *
//* Lab 10.1           *
//**********************

import java.util.ArrayList;
import java.util.Random;

public class deck
{
	private ArrayList <card> list = new ArrayList<card>();
	public deck()
	{
		ArrayList <card> list = new ArrayList<card>();
	}

	public void deckFill()
	{
		for(int index = 1;index < 14; index++)
		{
			list.add(new card(index,"Spades"));
		}
		for(int index = 1;index < 14; index++)
		{
			list.add(new card(index,"Diamonds"));
		}
		for(int index = 1;index < 14; index++)
		{
			list.add(new card(index,"Clubs"));
		}
		for(int index = 1;index < 14; index++)
		{
			list.add(new card(index,"Hearts"));
		}
	}

	public void deckShuffle()
	{
		Random gen = new Random();
		ArrayList <card> list2 = new ArrayList<card>();
		while(list.isEmpty() == false)
		{
			int a = gen.nextInt(list.size());
			list2.add(list.get(a));
			list.remove(a);
		}

		list=list2;
	}

	public void printCards()
	{
		for(int index = 0; index < 5; index++)
		{

			if(list.get(index).getCardValue() == 1)
			{
				System.out.println( "Ace of " + list.get(index).getFace());
			}
			else if(list.get(index).getCardValue() == 11)
			{
				System.out.println("Jack of " + list.get(index).getFace());
			}
			else if(list.get(index).getCardValue() == 12)
			{
				System.out.println("Queen of " + list.get(index).getFace());

			}
			else if(list.get(index).getCardValue() == 13)
			{
				System.out.println("King of " + list.get(index).getFace());
			}
			else
			{
				System.out.println( list.get(index).getCardValue() + " of " + list.get(index).getFace());
			}

		}

	}

	public  ArrayList getList()
	{
		return list;
	}


}