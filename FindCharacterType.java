package snippet;


public class FindCharacterType {

	public static void main(String[] args) 
	{
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		char[] array=test.toCharArray();
		// Here is what the count you need to find
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		for(int i=0;i<array.length;i++)
		{
			if(Character.isDigit(array[i]))
			{
				num=num+1;
			}
			else if(Character.isWhitespace(array[i]))
			{
				space=space+1;
			}
			else if(Character.isLetter(array[i]))
			{
				letter=letter+1;
			}
			else
				specialChar=specialChar+1;
		}
		System.out.println("num :"+num+" space :"+space+" letter: "+letter+" specialChar: "+specialChar);
	}

}
