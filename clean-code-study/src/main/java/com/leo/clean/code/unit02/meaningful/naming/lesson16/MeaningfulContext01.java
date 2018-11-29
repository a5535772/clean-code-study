package com.leo.clean.code.unit02.meaningful.naming.lesson16;

public class MeaningfulContext01 {

	public void printGuessStatistics(char candidate, int count) {
		String number;
		String verb;
		String pluralModifier;
		if (count == 0) {
			number = "no";
			verb = "are";
			pluralModifier = "s";

		} else if (count == 1) {
			number = "1";
			verb = "is";
			pluralModifier = "";
		} else {
			number = Integer.toString(count);
			verb = "are";
			pluralModifier = "s";
		}
		String guessMessage = String.format("There %s %s %s%s", verb, number, candidate, pluralModifier);
		printMessage(guessMessage);
	}

	private void printMessage(String guessMessage) {
		System.out.println(guessMessage);
	}

	public static void main(String[] args) {
		new MeaningfulContext01().printGuessStatistics('a', 0);
	}
}
