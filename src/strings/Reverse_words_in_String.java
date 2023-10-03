package strings;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Reverse_words_in_String {
	
    static String reverseWords(String str)
    {

        Pattern pattern = Pattern.compile("\\s");

        String[] temp = pattern.split(str);
        String result = "";

        for (int i = temp.length-1; i >= 0; i--) {
           
                result = result + temp[i] + " ";

        }
        return result;
    }

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String to reverse :");
		String st = sc.nextLine();
		
		System.out.println(reverseWords(st));

	}

}
