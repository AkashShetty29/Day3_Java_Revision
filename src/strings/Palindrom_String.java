package strings;

import java.util.Scanner;

public class Palindrom_String {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String to reverse :");
		String st = sc.nextLine();
		
		String st1 = st.toLowerCase();
		
		char ch[] = st1.toCharArray();
		char ch1[] = new char[ch.length];
		
		int i;
		int chlen = ch.length;
		boolean flag = false;
		
		for(i=chlen-1; i>=0; i--)
		{
			ch1[i]=ch[i];
			System.out.println(ch[i]);
		}
		
		String st3 = String.valueOf(ch1);
		System.out.println(st3);

		for(i=0; i<chlen; i++)
		{
			if (ch.equals(ch1))
			{
				flag = true;
			}
		}
		
		if(!flag)
		{
			System.out.println("Not Palindrome");
		}
		
		else 
		{
			System.out.println("Palindrome");
		}
		
		

	}

}
