package main.Choice;

import java.util.Scanner;

public class GetAChoice {
	int pickedNumber;

	public int Choice(String message) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(message);

		scanner.nextInt(pickedNumber);
		scanner.close();
		return pickedNumber;
	}
}
