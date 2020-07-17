import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

class RomanNumeralTest {

    @Test
    void shouldPrintEmpty_whenConvertingTheNumberZero() {
        String romanNumeral = RomanNumeralConverter.convert(0);

        assertThat(romanNumeral, equalTo(""));
    }

    @Test
    void shouldPrintAnI_whenConvertingTheNumberOne() {
        String romanNumeral = RomanNumeralConverter.convert(1);

        assertThat(romanNumeral, equalTo("I"));
    }

    @Test
    void shouldPrintII_whenConvertingTheNumberTwo() {
        String romanNumeral = RomanNumeralConverter.convert(2);

        assertThat(romanNumeral, equalTo("II"));
    }

    @Test
    void shouldPrintIII_whenConvertingTheNumberThree() {
        String romanNumeral = RomanNumeralConverter.convert(3);

        assertThat(romanNumeral, equalTo("III"));
    }

    @Test
    void shouldPrintIV_whenConvertingTheNumberFour() {
        String romanNumeral = RomanNumeralConverter.convert(4);

        assertThat(romanNumeral, equalTo("IV"));
    }

    @Test
    void shouldPrintV_whenConvertingTheNumberFive() {
        String romanNumeral = RomanNumeralConverter.convert(5);

        assertThat(romanNumeral, equalTo("V"));
    }

    @Test
    void shouldPrintVI_whenConvertingTheNumberSix() {
        String romanNumeral = RomanNumeralConverter.convert(6);

        assertThat(romanNumeral, equalTo("VI"));
    }

    @Test
    void shouldPrintX_whenConvertingTheNumberTen() {
        String romanNumeral = RomanNumeralConverter.convert(10);

        assertThat(romanNumeral, equalTo("X"));
    }

    @Test
    void shouldPrintL_whenConvertingTheNumberFifty() {
        String romanNumeral = RomanNumeralConverter.convert(50);

        assertThat(romanNumeral, equalTo("L"));
    }

    @Test
    void shouldPrintC_whenConvertingTheNumberOneHundred() {
        String romanNumeral = RomanNumeralConverter.convert(100);

        assertThat(romanNumeral, equalTo("C"));
    }

    @Test
    void shouldPrintLV_whenConvertingTheNumberFiftyFive() {
        String romanNumeral = RomanNumeralConverter.convert(55);

        assertThat(romanNumeral, equalTo("LV"));
    }

    @Test
    void shouldPrintCX_whenConvertingTheNumberFiftyOneHundredAndTen() {
        String romanNumeral = RomanNumeralConverter.convert(110);

        assertThat(romanNumeral, equalTo("CX"));
    }

    @Test
    void shouldPrintCXI_whenConvertingTheNumberFiftyOneHundredAndEleven() {
        String romanNumeral = RomanNumeralConverter.convert(111);

        assertThat(romanNumeral, equalTo("CXI"));
    }

    @Test
    void shouldPrintCLXXIX_whenConvertingTheNumber179() {
        String romanNumeral = RomanNumeralConverter.convert(179);

        assertThat(romanNumeral, equalTo("CLXXIX"));
    }

    @Test
    void shouldPrintXLIX_whenConvertingTheNumber49() {
        String romanNumeral = RomanNumeralConverter.convert(49);

        assertThat(romanNumeral, equalTo("XLIX"));
    }

    @Test
    void shouldPrintXCVIII_whenConvertingTheNumber98() {
        String romanNumeral = RomanNumeralConverter.convert(98);

        assertThat(romanNumeral, equalTo("XCVIII"));
    }

    @Test
    void shouldPrintD_whenConvertingTheNumber500() {
        String romanNumeral = RomanNumeralConverter.convert(500);

        assertThat(romanNumeral, equalTo("D"));
    }

    @Test
    void shouldPrintCDXCIX_whenConvertingTheNumber499() {
        String romanNumeral = RomanNumeralConverter.convert(499);

        assertThat(romanNumeral, equalTo("CDXCIX"));
    }
}
