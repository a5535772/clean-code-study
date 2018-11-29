package com.leo.clean.code.unit02.meaningful.naming.lesson16;

public class MeaningfulContext02 {
	private String number;
	private String verb;
	private String pluralModifier;

	public String make(char candidate, int count) {
		createPluraDependentMessageParts(count);
		return String.format("There %s %s %s%s", verb, number, candidate, pluralModifier);
	}

	private void createPluraDependentMessageParts(int count) {
		if (count == 0) {
			thereAreNoLetters();
		} else if (count == 1) {
			thereIsOneLetter();
		} else {
			thereAreManyLetters(count);
		}
	}

	private void thereAreManyLetters(int count) {
		number = Integer.toString(count);
		verb = "are";
		pluralModifier = "s";
	}

	private void thereIsOneLetter() {
		number = "1";
		verb = "is";
		pluralModifier = "";
	}

	private void thereAreNoLetters() {
		number = "no";
		verb = "are";
		pluralModifier = "s";
	}

	public static void main(String[] args) {
		System.out.println(new MeaningfulContext02().make('a', 0));
	}
	
}
