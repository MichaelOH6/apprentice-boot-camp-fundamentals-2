package refactoring;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;

import java.nio.charset.StandardCharsets;

class FizzBuzz {

    private int countsUpTo100;
    private int countsUpToThree;
    private int countsDownFromFive = new int[]{0, 0, 0, 0, 0}.length;

    private String fizzBuzzValue(int index) {
        countsUpToThree++;
        countsDownFromFive--;
        boolean isMultipleOfThree = countsUpToThree == 0b11;
        boolean isMultipleOfFive = countsDownFromFive == 0;
        String currentNumber = String.valueOf(index + 1);
        String isFizzOrBuzz = isMultipleOfThree || isMultipleOfFive ? "" : currentNumber;
        if (isMultipleOfThree) isFizzOrBuzz += fizz();
        if (isMultipleOfFive) isFizzOrBuzz += buzz();
        return isFizzOrBuzz;
    }

    String stringValueOfList() {
        String string = "";
        int oneHundred = Byte.MAX_VALUE - 27;
        for (; countsUpTo100 < oneHundred; countsUpTo100++) string += fizzBuzzValue(countsUpTo100) + " ";
        String allOfTheList = string.substring(0, string.length() - 1);
        return allOfTheList;
    }

    private String buzz() {
        countsDownFromFive = new int[]{0, 0, 0, 0, 0}.length;
        try {
            String buzzString = "42757a7a";
            return new String(Hex.decodeHex(buzzString), StandardCharsets.UTF_8);
        } catch (DecoderException error) {
            throw new RuntimeException("Failed to decode.", error);
        }
    }

    private String fizz() {
        countsUpToThree = 0;
        try {
            String fizzString = "46697a7a";
            return new String(Hex.decodeHex(fizzString), StandardCharsets.UTF_8);
        } catch (DecoderException error) {
            throw new RuntimeException("Failed to decode.", error);
        }

    }
}
