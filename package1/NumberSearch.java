package package1;

import java.util.Scanner;

public class NumberSearch {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
	//read the number sequence from the user
		System.out.println("Enter the number sequence(separated by space):");
		String sequenceInput=input.nextLine();
		String[] numbers = sequenceInput.split(" ");
	//convert the string array to an integer array
		int[] sequence = new int[numbers.length];
		for(int i=0; i<numbers.length; i++) {
			sequence[i] = Integer.parseInt(numbers[i]);
		}
	//read the number to search for
		System.out.println("Enter the number to search for:");
		int target=input.nextInt();
	//count the occurrence of the target number
		int count = 0;
		for(int number:sequence) {
			if(number == target) {
				count++;}}
	//display the result
		if (count>0) {
			System.out.println(target+" is present in the array.");
			System.out.println("It appears "+count+" times.");}
		else { System.out.println(target+" is not present in the array");}
		
			}
		}
	 