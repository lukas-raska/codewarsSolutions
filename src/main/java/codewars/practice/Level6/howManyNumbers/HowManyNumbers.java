package codewars.practice.Level6.howManyNumbers;

import java.util.ArrayList;
import java.util.List;


public class HowManyNumbers {

    private static List<Integer> integerList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Size: " + selNumber(1000, 1));
        integerList.stream().forEach(n -> System.out.print(n + " "));

    }

    public static int selNumber(int upperLimit, int difference) {
        List<Integer> selectedNumbers = new ArrayList<>();

        for (int i = 12; i <= upperLimit; i++) { // 12 is the smallest number that satisfied all the conditions
            if (hasRaisingDigits(i) && !hasDupliciteDigits(i) && hasRightDifferenceBetweenDigits(i, difference)) {
                selectedNumbers.add(i);
            }
        }
        HowManyNumbers.integerList = selectedNumbers;
        return selectedNumbers.size();

    }

    /**
     * Ověřuje, zda číslice v zadaném čísle mají vzestupnou tendenci
     */
    private static boolean hasRaisingDigits(int number) {
        String input = String.valueOf(number);
        char previousDigit = '0';
        for (char digit : input.toCharArray()) {
            if (Integer.parseInt(String.valueOf(digit)) <= Integer.parseInt(String.valueOf(previousDigit))) {
                return false;
            }
            previousDigit = digit;
        }
        return true;
    }

    /**
     * Ověřuje, zda zadané číslo má (true), či nemá (false) duplicitní číslice
     */
    private static boolean hasDupliciteDigits(int number) {
        String input = String.valueOf(number);
        for (int i = 0; i < input.length() - 1; i++) {
            for (int j = i + 1; j < input.length(); j++) {
                if (Integer.parseInt(String.valueOf(input.charAt(i))) == Integer.parseInt(String.valueOf(input.charAt(j)))) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Ověřuje zda rozdíl mezi hodnotou sousedních číslic zadaného čísla (number) je roven zadanému rozdílu (difference).
     * Pokud ano (true), ne (false)

     */
    private static boolean hasRightDifferenceBetweenDigits(int number, int difference) {
        String input = String.valueOf(number);
        char previousDigit = input.charAt(0);
        for (char digit : input.toCharArray()) {
            if (Integer.parseInt(String.valueOf(digit)) - Integer.parseInt(String.valueOf(previousDigit)) > difference) {
                return false;
            }
            previousDigit = digit;
        }
        return true;
    }
}
