import java.util.*;
import java.util.stream.Collectors;

public class RomanNumeralConverter {

    private static Map<Integer, String> ROMAN_REPRESENTATION;

    static {
        ROMAN_REPRESENTATION = new HashMap<>();

        ROMAN_REPRESENTATION.put(1, "I");
        ROMAN_REPRESENTATION.put(4, "IV");
        ROMAN_REPRESENTATION.put(5, "V");
        ROMAN_REPRESENTATION.put(9, "IX");
        ROMAN_REPRESENTATION.put(10, "X");
        ROMAN_REPRESENTATION.put(40, "XL");
        ROMAN_REPRESENTATION.put(50, "L");
        ROMAN_REPRESENTATION.put(90, "XC");
        ROMAN_REPRESENTATION.put(100, "C");
        ROMAN_REPRESENTATION.put(400, "CD");
        ROMAN_REPRESENTATION.put(500, "D");
    }

    public static String convert(int number) {
        if (number == 0){
            return "";
        }

        int lowerNumberFound = findFirstLowerRomanNumberThan(number);
        int remainingNumber = number - lowerNumberFound;

        return ROMAN_REPRESENTATION.get(lowerNumberFound) + convert(remainingNumber);
    }

    private static int findFirstLowerRomanNumberThan(int number) {
        List<Integer> sortedKeys = getSortedKeysFromRomanRepresentation();


        int higherKeyNumber = 0;

        for (int keyNumber: sortedKeys) {
            if(keyNumber > number){
                break;
            }

            higherKeyNumber = keyNumber;
        }

        return higherKeyNumber;
    }

    private static List<Integer> getSortedKeysFromRomanRepresentation() {
        return ROMAN_REPRESENTATION.keySet()
                    .stream()
                    .sorted()
                    .collect(Collectors.toList());
    }
}
