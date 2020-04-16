package Lesson7.java;
/**
A palindrome is a string that reads the same forwards and backwards. For
example, noon and madam are spelled the same forward and backward.
Develop an application which reads in a string and determines whether it is
a palindrome. If the input string is a palindrome, your application should
display the message:
The string is a palindrome.
Otherwise, it should print out the message:
The string is not a palindrome.
PalindromeApp is an application which does the following tasks
-- prompts the user to input a text
-- uses the instantiable class Palindrome to compute whether the user's input is a palindrome or not
-- retrieves the result of the palindrome check and displays it
*/
import java.util.*;
public class PalindromeApp {

	public static void main(String[] args) {
		// local variables
		String t;
		String message;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the text: ");
		t = sc.nextLine();
		
		Palindrome palindrome = new Palindrome();
		
		palindrome.setText(t);
		palindrome.decideIsPalindrome();
		
		message = palindrome.getPalindromeMessage();
		System.out.println(message);
		

	}

}
