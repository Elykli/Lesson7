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
The application should make use of instantiable classes.
*/
public class Palindrome {

	
		// instance variables
		private String text;
		private String palindromeMessage;
		
		public Palindrome() {
			text = "";
			palindromeMessage = "";//empty string
		}

		public void setText(String text) {
			this.text = text;
		}

		public String getPalindromeMessage() {
			return palindromeMessage;
		}
		
		public void decideIsPalindrome() {
			StringBuffer sb = new StringBuffer();
			//number of characters in the string
			int len = text.length();
			
			
			//traverse the text form the end to beginning(reverse)
			for(int i = len-1; i>=0; i--) {
				//retrieve one char in each interactions of the loop
				char c = text.charAt(i);
				//add each char to the stringBuffer
				sb.append(c);
			}
			
			//convert from a mutable represantation back to immutable, method is to string
			String reversedText = sb.toString();
			
			if(text.equalsIgnoreCase(reversedText)) {
				palindromeMessage = "The text " + text + " is a PALINDROME";
				
			}else {
				palindromeMessage = "The text " + text + "is not a palindrome";
			}
		}

	

}
