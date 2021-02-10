//**********************
//* Grant Guernsey     *
//* Period D           *
//* Lab 10.1           *
//**********************

public class card
{
	private int cardValue;
	private String face;

	public card()
	{
		cardValue = 1;
		face = "S";
	}

	public card(int value, String head)
	{
		cardValue = value;
		face = head;
	}

	public int getCardValue()
	{
		return cardValue;
	}


	public void setStudentNumber(int sn)
	{
		cardValue = sn;
	}

	public String getFace()
	{
		return face;
	}


	public void setFace(String fn)
	{
		face = fn;
	}



}
