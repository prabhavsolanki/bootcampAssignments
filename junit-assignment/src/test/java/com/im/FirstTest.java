package com.im;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

// Unit test cases for First

public class FirstTest {

    private First first;

    @BeforeAll
    static void before(){
        System.out.println("Starting Unit testing");
    }

    @AfterAll
    static void after()
    {
        System.out.println("All test cases completed");
    }

    @BeforeEach
    void beforeEach(){
        this.first = new First();
    }

    @AfterEach
    void afterEach(){
        System.out.println("Test completed");
    }

    @Nested
    class MainString_Contains_SubString
    {
        @Test
        void should_ReturnNewString_When_MainString_Contains_SubString() {
            //given
            String mainString = "Hey! I am free now you can ping me anytime";
            String subString = "ping";
            String replacementString = "call";
            String expected = "Hey! I am free now you can call me anytime";
            //when
            String actual = first.replaceSubString(mainString, subString, replacementString);
            //then
            assertEquals(expected, actual);
        }

        @Test
        void should_ReturnMainString_When_MainString_NotContains_SubString() {
            //given
            String mainString = "Hey! I am free now you can ping me anytime";
            String subString = "available";
            String replacementString = "call";

            //when
            String actual = first.replaceSubString(mainString, subString, replacementString);
            //then
            assertEquals(mainString, actual);
        }

        @Test
        void should_ReturnMainString_When_SubString_IsNull() {
            //given
            String mainString = "Hey! I am free now you can ping me anytime";
            String subString = null;
            String replacementString = "call";
            //when
            String actual = first.replaceSubString(mainString, subString, replacementString);
            //then
            assertNotNull(actual);
        }

        @Test
        void should_ReturnMainString_When_ReplacementString_IsNull() {
            //given
            String mainString = "Hey! I am free now you can ping me anytime";
            String subString = "ping";
            String replacementString = null;
            //when
            String actual = first.replaceSubString(mainString, subString, replacementString);
            //then
            assertNotNull(actual);
        }

        @Test
        void should_ReturnEmpty_When_MainString_IsEmpty() {
            //given
            String mainString = "";
            String subString = "ping";
            String replacementString = "call";
            String expected = "Hey! I am free now you can ping me anytime";
            //when
            String actual = first.replaceSubString(mainString, subString, replacementString);
            //then
            assertNotEquals(expected,actual);
        }

    }

    @Nested
    class StringIsPalindrome {

        @Test
        void should_ReturnTrue_When_StringIsPalindrome() {
            //given
            String originalString = "dad";
            //when
            boolean isPalindrome = first.isPallindrome(originalString);

            //then
            assertTrue(isPalindrome);
        }

        @Test
        void should_ReturnFalse_When_StringIsNotPalindrome() {
            //given
            String originalString = "milky";
            //when
            boolean isPalindrome = first.isPallindrome(originalString);
            //then
            assertFalse(isPalindrome);
        }

        @Test
        void should_ReturnTrue_When_OriginalStringIsEmpty() {
            //given
            String originalString = "";

            //when
            boolean isPalindrome = first.isPallindrome(originalString);
            //then
            assertEquals(true,isPalindrome);
        }

        @Test
        void should_ReturnTrue_When_OneCharacterStringIsPassed() {
            //given
            String originalString = "a";

            //when
            boolean isPalindrome = first.isPallindrome(originalString);

            //then
            assertEquals(true,isPalindrome);
        }

        @Test
        void should_ThrowsNullPointerException_When_OriginalStringIsNull() {
            //given
            String originalString = null;

            //when
            Executable executable =()-> first.isPallindrome(null);
            //then
            assertThrows(NullPointerException.class,executable);
        }

    }

    @Nested
    class  FilterEvenElements {

        @Test
        void should_ReturnListOfEvenNumbers_When_FilteringAllElements() {
            //given
            List<Integer> list = new ArrayList<>();
            list.add(45);
            list.add(56);
            list.add(60);
            list.add(23);
            List<Integer> expected = new ArrayList<>();
            expected.add(45);
            expected.add(23);
            //when
            List<Integer> actual = first.filterEvenElements(list);
            //then
            assertEquals(expected, actual);
        }

        @Test
        void should_ReturnNull_When_ListOnlyContainsEvenElements() {
            //given
            List<Integer> list = new ArrayList<>();
            list.add(46);
            list.add(56);
            list.add(60);
            list.add(24);
            List<Integer> expected = new ArrayList<>();
            expected.add(45);
            expected.add(23);
            ;
            //when
            List<Integer> actual = first.filterEvenElements(list);
            //then
            assertNotEquals(expected, actual);
        }
    }

    @Nested
    class  CalculateAverage {
        @Test
        void should_ReturnAverage_When_We_CalculateAverage() {
            //given
            List<BigDecimal> values = new ArrayList<BigDecimal>();
            values.add(new BigDecimal(123.445));
            values.add(new BigDecimal(234.678));
            values.add(new BigDecimal(345.321));
            BigDecimal expectedValues = new BigDecimal(234.48133333333333894188399426639080047607421875 );

            //when
            BigDecimal actual = first.calculateAverage(values);
            //then
            assertEquals(expectedValues, actual);
        }

        @Test
        void should_ThrowsRuntimeException_When_ListIsEmpty() {
            //given
            List<BigDecimal> values = new ArrayList<BigDecimal>();

            //when
            Executable executable = () -> first.calculateAverage(values);
            //then
            assertThrows(RuntimeException.class, executable);
        }

        @Test
        void should_ThrowsRuntimeException_When_ListSizeIsOne() {
            //given
            List<BigDecimal> values = null;
            //when
            Executable executable = () -> first.calculateAverage(values);
            //then
            assertThrows(RuntimeException.class, executable);
        }
    }
}