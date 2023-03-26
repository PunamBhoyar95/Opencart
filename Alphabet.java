package Java;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) 
	{
		
				  char c;	
				Scanner obj=new Scanner(System.in);
				System.out.println("Enter alphabate");
			String ch=obj.next();
			if (ch=="a" && ch=="e"&& ch=="i"&& ch=="o"&& ch=="u")
				System.out.println("Alphabet is VOWEL");
			else 
				System.out.println("Alphabet is CONSONANT ");
			
			}
		
	}


