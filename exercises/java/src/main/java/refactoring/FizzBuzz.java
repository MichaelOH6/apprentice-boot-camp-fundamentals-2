package refactoring;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;

import java.nio.charset.StandardCharsets;

class FizzBuzz {

//    public static final String BUZZ_STRING = "42757a7a";
//    public static final String FIZZ_STRING = "46697a7a";
    public static final int ONE_HUNDRED = Byte.MAX_VALUE - 27;
    public static final int THREE = 0b11;
    public static final int LENGTH = new int[]{0, 0, 0, 0, 0}.length;
    private int countsUpTo100;
    private int countsUpToThree;
    private int countsDownFromFive = LENGTH;

    private String fizzBuzzValue(int index) {
        counterPlusOne();
        counterDownFrom5MinusOne();
        boolean isMultipleOfThree = countsUpToThree == THREE;
        boolean isMultipleOfFive = countsDownFromFive == 0;
        String currentNumber = String.valueOf(index + 1);
        String isFizzOrBuzz = getHexValue(isMultipleOfThree, isMultipleOfFive, currentNumber);
        if (isMultipleOfThree) isFizzOrBuzz += fizz();
        if (isMultipleOfFive) isFizzOrBuzz += buzz();
        return isFizzOrBuzz;
    }

    private String getHexValue(boolean isMultipleOfThree, boolean isMultipleOfFive, String currentNumber) {
        return isMultipleOfThree || isMultipleOfFive ? "" : currentNumber;
    }

    private void counterDownFrom5MinusOne() {
        countsDownFromFive--;
    }

    private void counterPlusOne() {
        countsUpToThree++;
    }

    String playGame() {
        String string = "";
        for (; countsUpTo100 < ONE_HUNDRED; countsUpTo100++) string += fizzBuzzValue();
        String allOfTheList = string.substring(0, string.length() - 1);
        return allOfTheList;
    }

    private String fizzBuzzValue() {
        return fizzBuzzValue(countsUpTo100) + " ";
    }

    private String buzz() {
        countsDownFromFive = LENGTH;
        String hexValue = "42757a7a";
        return getHexValue(hexValue);
    }

    private String fizz() {
        countsUpToThree = 0;
        String hexValue = "46697a7a";
        return getHexValue(hexValue);

    }

    private String getHexValue(String hexValue) {
        try {
            return new String(Hex.decodeHex(hexValue), StandardCharsets.UTF_8);
        } catch (DecoderException error) {
            throw new RuntimeException("Failed to decode.", error);
        }
    }
}
