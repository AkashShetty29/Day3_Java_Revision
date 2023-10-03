package strings;

import java.util.Scanner;

public class Counting_Vowels_and_Consonents {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String to count :");
		String ch = sc.nextLine();
		
		String st = ch.toLowerCase();
		
		char a[] = st.toCharArray();
		
		int vcount = 0;
		int ccount = 0;
		int i;
		
		for(i=0; i<a.length; i++)
		{
			if(a[i]=='a' || a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u')
			{
				vcount++;
			}
			
			else if(a[i]==' ')
			{
				continue;
			}

			else
			{
				ccount++;
			}
		}
		
		System.out.println("Total Vowel count is : "+vcount);
		System.out.println("Total Consonent count is : "+ccount);
	}

}
