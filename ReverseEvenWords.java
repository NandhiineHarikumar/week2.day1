package snippet;

import java.util.Arrays;

public class ReverseEvenWords {

	public static void main(String[] args) 
	{
		String input="This sunday is a good day";
		String array[]=input.split(" ");
		
		for(int i=0;i<array.length;i++)
		{
			if(i%2!=0)
			{
				String rev="";
				for(int j=(array[i].length())-1;j>=0;j--) 
				{ 
				//System.out.print(resultArray[j]);
				rev= rev + array[i].charAt(j);
				}
				array[i]=rev;
			}
			else if(i%2!=0)
			{
				array[i]=array[i];
			}
			else
				continue;
		}
		//System.out.println(Arrays.toString(array));
		for(String s:array)
		{
			System.out.print(s+" ");
		}

	}

}
