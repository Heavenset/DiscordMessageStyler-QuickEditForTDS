package main.StyleRelated;

import main.Choice.GetAChoice;

public class StylePicker {
	GetAChoice getAChoice = new GetAChoice();
	
	boolean showingMessageForTheFirstTime = true;
	
	// Message for a "Choice" function in "pickAStyle()"
			String styleMessage = "Pick a number: \n"
					+ "1. Bold\n"
					+ "2. Italic\n"
					+ "3. Crossed";
			
	
	public void pickAStyle() {
		if (!showingMessageForTheFirstTime) {
			System.out.println("Here you will be choosing a style for a specific part of your message.");
			showingMessageForTheFirstTime = false;
		}
		
		getAChoice.Choice(styleMessage);
		
	}
}
