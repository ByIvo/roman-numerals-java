import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

class RomanNumeralTest {

    @Test
    void shouldPrintEmpty_whenConvertingTheNumberZero() {
        String romanNumeral = RomanNumeralConverter.convert(0);

        assertThat(romanNumeral, equalTo(""));
    }

    @ParameterizedTest
    @CsvSource({
            "1,     I",
            "2,     II",
            "3,     III",
            "4,     IV",
            "5,     V",
            "6,     VI",
            "10,    X",
            "49,    XLIX",
            "50,    L",
            "55,    LV",
            "98,    XCVIII",
            "100,   C",
            "110,   CX",
            "111,   CXI",
            "179,   CLXXIX",
            "499,   CDXCIX",
            "500,   D",
    })
    void shouldPrintAnI_whenConvertingTheNumberOne(int arabicNumber, String expectedRomanNumber) {
        String romanNumeral = RomanNumeralConverter.convert(arabicNumber);

        assertThat(romanNumeral, equalTo(expectedRomanNumber));
    }
}
