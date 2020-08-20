package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countingCharHashMap {
    public static void main(String[] args) {
        HashMap<Character, Integer> countingChar = new HashMap<>();
        Scanner input = new Scanner(System.in);

        String phrase = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
       // System.out.println("Enter a phrase to count: ");
       // String phrase = input.nextLine();
        String phraseToLowerCase = phrase.toLowerCase();
        char[] charsInString = phraseToLowerCase.toCharArray();

        for (char letter: charsInString) {
            if (countingChar.containsKey(letter)) {
                countingChar.put(letter, countingChar.get(letter) + 1);
            }else{
                countingChar.put(letter, 1);
            }

        }
        for(Map.Entry<Character, Integer> oneChar : countingChar.entrySet()){
            System.out.println(oneChar.getKey() + ": " + oneChar.getValue());
        }

    }
}
