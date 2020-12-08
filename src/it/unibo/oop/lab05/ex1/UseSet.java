package it.unibo.oop.lab05.ex1;

import java.util.Set;
import java.util.TreeSet;


/**
 * Example class using {@link Set}.
 * 
 */
public final class UseSet {

    private static final int NUM = 20;

	private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         * 
         * 1) Builds a TreeSet containing Strings
         */ 
         final var tree = new TreeSet<String>();
          
         /* 2) Populates such Collection with all the Strings ranging from "1" to
         * "20"
         */
         for (int i=1; i<=NUM; i++) {
        	 tree.add(Integer.toString(i));
         }
         
         // 3) Prints its content
         System.out.println("Int added" + tree);
          
         /* 4) Removes all those strings whose represented number is divisible by
         * three
         */
         final var scor = tree.iterator();
         while (scor.hasNext()) {
        	 if(Integer.parseInt(scor.next()) % 3 == 0) {
        		 scor.remove();
        	 }
         }
         
         // 5) Prints the content of the Set using a for-each costruct
         for(var i : tree) {
        	 System.out.println(tree);
         }
         
         /* 6) Verifies if all the numbers left in the set are even
         */
         final var even = tree.iterator();
         while (even.hasNext()) {
        	 if (Integer.parseInt(scor.next()) % 2 !=0) {
        		 System.out.println("ERROR: There is an odd");
        	 }else {
        		 System.out.println("Even set: " + even);
        		 }
         }
         
    }
}
