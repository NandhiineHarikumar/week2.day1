package snippet;

public class ChecckNumberOfOccuranceOfChar {

	public static void main(String[] args) 
	{
		String input="mammal";
		char[] array=input.toCharArray();
		int count=0;int count1=0;
		char character='m';
		for(int i=0;i<array.length;i++)
		{
			
			if(array[i]==character)
			{
				count=count+1;
			}
		}
		System.out.println("Number of occurance of "+character+" Using Arrays: "+ count);

		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)==character)
			{
				count1=count1+1;
			}
			else
				continue;
		}
		System.out.println("Number of occurance of "+character+" Using String methods: "+ count1);
	}

}
