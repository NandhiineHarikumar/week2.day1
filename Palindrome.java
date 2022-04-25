package snippet;

public class Palindrome {

	public static void main(String[] args) 
	{
		String name="radar";
		//String name="rad";
		String rev_str="";
		for(int i=(name.length())-1;i>=0;i--) 
		{ 
			rev_str = rev_str +name.charAt(i);
		}
		//System.out.println(rev_str);
		if(name.equals(rev_str))
		{
			System.out.println(name+" is Palindrome");
		}
		else
		{
			System.out.println(name+" is not Palindrome");
		}
	}
}
