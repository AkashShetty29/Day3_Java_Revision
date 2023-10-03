package strings;

import java.util.Scanner;

public class Palindrome2_String {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String to reverse :");
		String st = sc.nextLine();
        String reverse = "";     
        
        int len = st.length();
        
        for(int i = len - 1; i >= 0; i--)
        {
        	reverse = reverse + st.charAt(i);
        }
        
        if(st.equalsIgnoreCase(reverse))
        {
            System.out.println(st +" is PALINDROME.");
        }
        else
        {
            System. out.println(st +" is NOT a PALINDROME.");
        }

	}

}
