package tudelft.myRoman;

import java.util.*;

public class myRoman {
    private Dictionary numerals;

    public myRoman() {
        numerals = new Hashtable();
        numerals.put('I', 1);
        numerals.put('V', 5);
        numerals.put('X', 10);
        numerals.put('L', 50);
        numerals.put('C', 100);
        numerals.put('D', 500);
        numerals.put('M', 1000);
    }

    public int convert(String romanNumeral) {
        int prev = 0;
        int current;
        int sum = 0;
        for(char c: romanNumeral.toCharArray()) {
            current = (int)numerals.get(c);
            if((current/10) == prev || (current/5) == prev) { //check if previous number equals a fifth or tenth of the current number to determine if subtraction notation applies
                sum += current;
                sum -= prev*2; //to account for adding the previous number once already
            } else {
                sum += current;
            }
            prev = current;
        }
        return sum;
    }
}
