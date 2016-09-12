package string.sentence;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner user_input = new Scanner( System.in );
		
		StringBuilder s = new StringBuilder();

		System.out.println("Uit hoeveel worden wilt u een zin maken?");
		int words = user_input.nextInt();


		String woord;
		for(int i = 1;i <= words;i++){
			System.out.println("Voer uw word in:");
			woord = user_input.next();
			if(i < words){
				s.append(woord + " ");
			}else{
				// If end of string has been reached
				s.append(woord + ".");
			}

		}

		System.out.println(s);

	}

}
