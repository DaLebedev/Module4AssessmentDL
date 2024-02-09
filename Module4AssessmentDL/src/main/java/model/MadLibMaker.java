/**
 * Author: Daniel Lebedev - dalebedev 
 * Description: XXX
 * CIS 175 - Spring 2024
 * Feb 8, 2024
 */
package model;

public class MadLibMaker {

	private String adjective1;
	private String adjective2;
	private String pluralNoun1;
	private String pluralNoun2;
	private String adjective3;
	private String pluralNoun3;
	private String animal;
	private String verb;
	private String pastTenseVerb1;
	private String pastTenseVerb2;


	// Constructors
	public MadLibMaker() {
		super();
	}
	
	public MadLibMaker(String adjective1, String adjective2, String pluralNoun1,
			String pluralNoun2, String adjective3, String pluralNoun3, String animal,
			String verb, String pastTenseVerb1, String pastTenseVerb2) {
		super();
		this.adjective1 = makeUppercase(adjective1);
		this.adjective2 = makeUppercase(adjective2);
		this.pluralNoun1 = makeUppercase(pluralNoun1);
		this.pluralNoun2 = makeUppercase(pluralNoun2);
		this.adjective3 = makeUppercase(adjective3);
		this.pluralNoun3 = makeUppercase(pluralNoun3);
		this.animal =  makeUppercase(animal);
		this.verb = makeUppercase(verb);
		this.pastTenseVerb1 = makeUppercase(pastTenseVerb1);
		this.pastTenseVerb2 = makeUppercase(pastTenseVerb2);
	}
	
	// Helper method to convert input into uppercase
	public String makeUppercase(String inputWord) {
		if (inputWord != null) {
	        return inputWord.toUpperCase();
	    } else {
	        return null;
	    }
	}
	
	// Creates string representation of object
	@Override
	public String toString() {
		return "MadLibMaker [adjective1= " + adjective1 + "adjective2=" + adjective2 +
				"pluralNoun1=" + pluralNoun1 + "pluralNoun2=" + pluralNoun2 + 
				"adjective3=" + adjective3 + "pluralNoun3=" + pluralNoun3 + 
				"animal=" + animal + "verb=" + verb + "pastTenseVerb1=" + 
				pastTenseVerb1 + "pastTenseVerb2=" + pastTenseVerb2 + "]";
	}
	
	// Getters and Setters
	public String getAdjective1() {
		return adjective1;
	}

	public void setAdjective1(String adjective1) {
		this.adjective1 = adjective1;
		makeUppercase(adjective1);
	}

	public String getAdjective2() {
		return adjective2;
	}

	public void setAdjective2(String adjective2) {
		this.adjective2 = adjective2;
		makeUppercase(adjective2);
	}

	public String getPluralNoun1() {
		return pluralNoun1;
	}

	public void setPluralNoun1(String pluralNoun1) {
		this.pluralNoun1 = pluralNoun1;
		makeUppercase(pluralNoun1);
	}

	public String getPluralNoun2() {
		return pluralNoun2;
	}

	public void setPluralNoun2(String pluralNoun2) {
		this.pluralNoun2 = pluralNoun2;
		makeUppercase(pluralNoun2);
	}

	public String getAdjective3() {
		return adjective3;
	}

	public void setAdjective3(String adjective3) {
		this.adjective3 = adjective3;
		makeUppercase(adjective3);
	}

	public String getPluralNoun3() {
		return pluralNoun3;
	}

	public void setPluralNoun3(String pluralNoun3) {
		this.pluralNoun3 = pluralNoun3;
		makeUppercase(pluralNoun3);
	}

	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
		makeUppercase(animal);
	}

	public String getVerb() {
		return verb;
	}

	public void setVerb(String verb) {
		this.verb = verb;
		makeUppercase(verb);
	}

	public String getPastTenseVerb1() {
		return pastTenseVerb1;
	}

	public void setPastTenseVerb1(String pastTenseVerb1) {
		this.pastTenseVerb1 = pastTenseVerb1;
		makeUppercase(pastTenseVerb1);
	}

	public String getPastTenseVerb2() {
		return pastTenseVerb2;
	}

	public void setPastTenseVerb2(String pastTenseVerb2) {
		this.pastTenseVerb2 = pastTenseVerb2;
		makeUppercase(pastTenseVerb2);
	}

	
}
