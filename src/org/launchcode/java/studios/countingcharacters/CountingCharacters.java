package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String [] args) {
        //String word = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word or phrase: ");
        String word = input.nextLine();
        input.close();

        Character[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        HashMap<Character, Integer> letterCount = new HashMap<>();
        for (char z : word.toLowerCase().toCharArray()) {
            if (!letterCount.containsKey(z)) {
                for (char letter : alphabet) {
                    if (z == letter) {
                        letterCount.put(z, 1);
                    }
                }
            } else {
                Integer num = letterCount.get(z);
                num++;
                letterCount.put(z, num);
            }
        }

        for (Character charInList : letterCount.keySet()) {
            String key = charInList.toString();
            String value = letterCount.get(charInList).toString();
            System.out.println(key + ": " + value);
        }
    }
}

