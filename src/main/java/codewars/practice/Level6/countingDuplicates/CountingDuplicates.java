package codewars.practice.Level6.countingDuplicates;

import java.util.ArrayList;
import java.util.List;

public class CountingDuplicates {

    public static void main(String[] args) {
        String text = "ABBA";
        System.out.println(duplicateCount(text));
    }

    public static int duplicateCount(String text) {

        List<Character> testedCharacters = new ArrayList<>();
        List<Character> duplicateCharacters = new ArrayList<>();
        int countOfDuplicates = 0;

        for (Character c : text.toLowerCase().toCharArray()) {
            if (testedCharacters.contains(c) && !duplicateCharacters.contains(c)) {
                countOfDuplicates++;
                duplicateCharacters.add(c);
            }
            testedCharacters.add(c);
        }
        return countOfDuplicates;

    }
}
