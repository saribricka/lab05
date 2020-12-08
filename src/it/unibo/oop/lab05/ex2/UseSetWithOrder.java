package it.unibo.oop.lab05.ex2;

import java.util.TreeSet;

public final class UseSetWithOrder {

    private static final int HUN = 100;

	private UseSetWithOrder() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        /*
         * Write a program which:
         * 
         * 1) Creates a new ORDERED TreeSet of Strings. To order the set, define
         * a new Comparator in a separate class.
         */
    	final var tree = new TreeSet<String>(new PersonalComparator());
         /* 2) Inserts in the set a hundred strings containing randomly generated
         * numbers (use Math.random())
         */
    	for (int i=1; i<=HUN; i++) {
    		tree.add(Double.toString(Math.random()));
    	}
        /* 3) Prints the set, which must be ordered
         */
    	System.out.println(tree);
    }
}
