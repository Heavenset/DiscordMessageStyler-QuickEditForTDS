package main;

import main.StyleRelated.StylePicker;

public class ApplicationStarter {
	StylePicker stylePicker = new StylePicker();

	int category;

	public void start() {
		switch (category) {
			case 1:
				stylePicker.pickAStyle();
				break;

			default:
				System.out.println("Uh-oh, something went wrong! :(");
		}

	}
}
