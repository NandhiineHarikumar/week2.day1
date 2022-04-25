package snippet;
import java.util.Arrays;

public class AnagramSample {

	public static void main(String[] args) 
	{
		/*
		 * String input1="cinema"; String input2="iceman";
		 */
		//String input1="cat";
		//String input2="act";
		String input1="night";
		String input2="thing";
		/*
		 * for(int i=0;i<(input1.length());i++) { array1[i]=input1.charAt(i); } 
		 * for(int i=0;i<(input2.length());i++) { array2[i]=input2.charAt(i); }
		 */
		
		
		char[] array1=input1.toCharArray();
		char[] array2=input2.toCharArray();
		Arrays.sort(array1);
		Arrays.sort(array2);
		if(Arrays.equals(array1,array2))
		{
			System.out.println("Its an anagram");
		}
		else
			System.out.println("Its not an anagram");
	}

}
