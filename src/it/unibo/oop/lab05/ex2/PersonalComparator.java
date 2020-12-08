package it.unibo.oop.lab05.ex2;

import java.util.Comparator;

public class PersonalComparator implements Comparator<String> {

	public PersonalComparator() {
		super();
	}
	
	public int compare(String st1, String st2) {
		return Double.compare(Double.parseDouble(st1), Double.parseDouble(st2));
	}
}
