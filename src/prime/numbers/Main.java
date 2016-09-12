package prime.numbers;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner user_input = new Scanner( System.in );

		System.out.println("Wat is het begin getal?");
		int firstNumber = user_input.nextInt();

		System.out.println("Wat is het eind getal?");
		int lastNumber = user_input.nextInt();


		if(firstNumber <= lastNumber){
			
			boolean isPrime = false;

			while(firstNumber <= lastNumber){

				for(int i = 2; i < firstNumber; i++){

					if(firstNumber % i == 0){
						isPrime = false;
						break;
					}else{
						isPrime = true;
					}

				}
				
				if(isPrime == true){
					System.out.print(firstNumber + " ");
				}
				firstNumber++;

			}

		}else{
			System.out.println("Eindgetal moet groter zijn dan het begin getal.");
		}


	}

}
