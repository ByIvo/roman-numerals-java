import java.util.*;
import java.util.stream.Collectors;

public class RomanNumeralConverter {

    private static Map<Integer, String> ROMAN_NUMBERS_REPRESENTATION;

    static {
        ROMAN_NUMBERS_REPRESENTATION = new HashMap<>();

        ROMAN_NUMBERS_REPRESENTATION.put(1, "I");
        ROMAN_NUMBERS_REPRESENTATION.put(4, "IV");
        ROMAN_NUMBERS_REPRESENTATION.put(5, "V");
        ROMAN_NUMBERS_REPRESENTATION.put(10, "X");
        ROMAN_NUMBERS_REPRESENTATION.put(50, "L");
        ROMAN_NUMBERS_REPRESENTATION.put(100, "C");
    }

    public static String convert(int number) {
        if (ROMAN_NUMBERS_REPRESENTATION.containsKey(number)) {
            return ROMAN_NUMBERS_REPRESENTATION.get(number);
        }

        return createComposedRomanNumber(number);
    }

    private static String createComposedRomanNumber(int number) {
        StringBuilder stb = new StringBuilder();

        do {
            int higherKeyNumber = findLowerRomanNumber(number);
            number -= higherKeyNumber;

            stb.append(ROMAN_NUMBERS_REPRESENTATION.get(higherKeyNumber));
        } while (number != 0);

        return stb.toString();
    }

    private static int findLowerRomanNumber(int number) {
        int higherKeyNumber = 0;

        List<Integer> sortedKeys = ROMAN_NUMBERS_REPRESENTATION.keySet()
                .stream()
                .sorted()
                .collect(Collectors.toList());

        for (int keyNumber: sortedKeys) {
            if(keyNumber > number){
                break;
            }

            higherKeyNumber = keyNumber;
        }

        return higherKeyNumber;
    }
}
