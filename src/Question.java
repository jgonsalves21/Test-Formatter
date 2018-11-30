
public abstract class Question {
	
	private int number;
	private String text;
	
	public Question(String word)
	{
		text = word;;
		number = 1;
		number++;
	}
	
	public int getNumber()
	{
		return number;
	}
	
	public String getText()
	{
		return text;
	}
	
	public abstract String getSolution();
}
