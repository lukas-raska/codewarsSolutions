package codewars.practice.Level5.gapInPrimes;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.LinkedList;

public class GapInPrimes {

    public static void main(String[] args) {
        try {
            Arrays.stream(GapInPrimes.gap(6, 100, 110)).forEach(System.out::println);
        }catch (NullPointerException exception){
            System.out.println("Při tomto zadání neexistuje řešení.");
        }

    }

    public static long[] gap(int gap, long min, long max) throws NullPointerException {

        LinkedList<Long> foundedPrimes = new LinkedList<>();

        for (long i = min; i < max; i++) {
            BigInteger number = BigInteger.valueOf(i);
            if (number.isProbablePrime(1)) {
                foundedPrimes.addLast(number.longValue());
                if (foundedPrimes.size()==2) {
                    long difference = foundedPrimes.getLast()-foundedPrimes.getFirst();
                    if (difference==gap){
                        return new long[] {foundedPrimes.getFirst(), foundedPrimes.getLast()};
                    } else {
                        foundedPrimes.removeFirst();
                    }
                }
            }
        }
        return null;
    }
}
