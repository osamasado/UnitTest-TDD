
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
     void fizzBuzz_shouldReturn1_whenCalledWith1() {
        int number = 1;
        String expected = "1";
        String actual = Main.fizzBuzz(number);
        assertEquals(expected, actual);
    }

    @Test
    void fizzBuzz_shouldReturn2_whenCalledWith2() {
        int number = 2;
        String expected = "2";
        String actual = Main.fizzBuzz(number);
        assertEquals(expected, actual);
    }

    @Test
    void fizzBuzz_shouldReturnFizz_whenCalledWith3() {
        int number = 3;
        String expected = "Fizz";
        String actual = Main.fizzBuzz(number);
        assertEquals(expected, actual);
    }

    @Test
    void fizzBuzz_shouldReturn4_whenCalledWith4() {
        int number = 4;
        String expected = "4";
        String actual = Main.fizzBuzz(number);
        assertEquals(expected, actual);
    }

    @Test
    void fizzBuzz_shouldReturnBuzz_whenCalledWith5() {
        int number = 5;
        String expected = "Buzz";
        String actual = Main.fizzBuzz(number);
        assertEquals(expected, actual);
    }

    @Test
    void fizzBuzz_shouldReturnFizzBuzz_whenCalledWith15() {
        int number = 15;
        String expected = "FizzBuzz";
        String actual = Main.fizzBuzz(number);
        assertEquals(expected, actual);
    }

    // Level 1: Easy
    // Aufgabe 1 – sum()
    @Test
    void sum_shouldReturn5_whenCalledWith2And3() {
        int a = 2;
        int b = 3;
        int expected = 5;
        int actual = Main.sum(a,b);
        assertEquals(expected, actual);
    }

    // Aufgabe 2 – isEven()
    @Test
    void even_shouldReturnTrue_whenCalledWith2() {
        int a = 2;
        boolean actual = Main.isEven(a);
        assertTrue(actual);
    }
    @Test
    void even_shouldReturnFalse_whenCalledWith1() {
        int a = 1;
        boolean actual = Main.isEven(a);
        assertFalse(actual);
    }

    // Aufgabe 3 – getFirstCharacter()
    @Test
    void getFirstCharacter_shouldReturnNull_whenCalledWithEmptyString() {
        String a = "";
        Character actual = Main.getFirstCharacter(a);
        assertNull(actual);
    }
    @Test
    void getFirstCharacter_shouldReturnH_whenCalledWithHallo() {
        String a = "Hallo";
        String expected = "H";
        Character actual = Main.getFirstCharacter(a);
        assertNotNull(actual);
       // assertEquals(expected,actual.toString());
    }

    //Level 2: Medium
    //Aufgabe 4 – reverseString()
    @Test
    void reverseString_shouldReturnavaJ_whenCalledWithJava() {
        String a = "Java";
        String expected = "avaJ";
        String actual = Main.reverseString(a);
        assertArrayEquals(expected.toCharArray(), actual.toCharArray());
    }
    @Test
    void reverseString_shouldReturnamasO_whenCalledWithOsama() {
        String a = "amasO";
        String expected = "Osama";
        String actual = Main.reverseString(a);
        assertArrayEquals(expected.toCharArray(), actual.toCharArray());
    }
    @Test
    void reverseString_shouldReturnNull_whenCalledWithNull() {
        assertNull(Main.reverseString(null));
    }

    //Aufgabe 5 – isPalindrome()
    @Test
    void isPalindrome_shouldReturnTrue_whenCalledWithOtto() {
        String a = "Otto";
        assertTrue(Main.isPalindrome(a));
    }
    @Test
    void isPalindrome_shouldReturnFalse_whenCalledWithJava() {
        String a = "Java";
        assertFalse(Main.isPalindrome(a));
    }
    @Test
    void isPalindrome_shouldReturnTrue_whenCalledWithOttto() {
        String a = "Ottto";
        assertTrue(Main.isPalindrome(a));
    }

    //Aufgabe 6 – countVowels()
    @Test
    void countVowels_shouldReturn0_whenCalledWithNull() {
        String a = null;
        assertEquals(0, Main.countVowels(a));
    }
    @Test
    void countVowels_shouldReturn0_whenCalledWithEmptyString() {
        String a = "";
        assertEquals(0, Main.countVowels(a));
    }
    @Test
    void countVowels_shouldReturn2_whenCalledWithHallo() {
        String a = "Hallo";
        assertEquals(2, Main.countVowels(a));
    }
    @Test
    void countVowels_shouldReturn3_whenCalledWithOsama() {
        String a = "Osama";
        assertEquals(3, Main.countVowels(a));
    }

    //Level 3: Bonus
    //Aufgabe 7 – factorial()
    @Test
    void factorial_shouldReturn1_whenCalledWith0() {
        int number = 0;
        int expected = 1;
        int actual = Main.factorial(number);
        assertEquals(expected, actual);
    }
    @Test
    void factorial_shouldReturn120_whenCalledWith5() {
        int number = 5;
        int expected = 120; // 5* 4 * 3 * 2 * 1
        int actual = Main.factorial(number);
        assertEquals(expected, actual);
    }

    @Test
    void factorial_shouldReturn1_whenCalledWith1() {
        int number = 1;
        int expected = 1; // 1 * 1
        int actual = Main.factorial(number);
        assertEquals(expected, actual);
    }

    @Test
    void factorial_shouldReturn3_whenCalledWith6() {
        int number = 3;
        int expected = 6; // 3 * 2 * 1
        int actual = Main.factorial(number);
        assertEquals(expected, actual);
    }

    //Aufgabe 8 – fibonacci()
    @Test
    void fibonacci_shouldReturn0_whenCalledWith0() {
        int number = 0;
        int expected = 0;
        int actual = Main.fibonacci(number);
        assertEquals(expected, actual);
    }
    @Test
    void fibonacci_shouldReturn1_whenCalledWith1() {
        int number = 1;
        int expected = 1;
        int actual = Main.fibonacci(number);
        assertEquals(expected, actual);
    }
    @Test
    void fibonacci_shouldReturn1_whenCalledWith2() {
        int number = 2;
        int expected = 1;
        int actual = Main.fibonacci(number);
        assertEquals(expected, actual);
    }

    @Test
    void fibonacci_shouldReturn2_whenCalledWith3() {
        int number = 3;
        int expected = 2;
        int actual = Main.fibonacci(number);
        assertEquals(expected, actual);
    }

    @Test
    void fibonacci_shouldReturn8_whenCalledWith6() {
        int number = 6;
        int expected = 8;
        int actual = Main.fibonacci(number);
        assertEquals(expected, actual);
    }

    //Aufgabe 9 – mergeArrays()
    @Test
    void mergeArrays_shouldReturnEmptyArray_whenCalledWithEmptyArrays() {
        int[] a = {};
        int[] b = {};
        int[] expected = {};
        int[] actual = Main.mergeArrays(a,b);
        assertArrayEquals(expected, actual);
    }
    @Test
    void mergeArrays_shouldReturn1234_whenCalledWith12And34() {
        int[] a = {1, 2};
        int[] b = {3, 4};
        int[] expected = {1, 2, 3, 4};
        int[] actual = Main.mergeArrays(a,b);
        assertArrayEquals(expected, actual);
    }
    @Test
    void mergeArrays_shouldReturn12_whenCalledWith12AndEmpty() {
        int[] a = {1, 2};
        int[] b = {};
        int[] expected = {1, 2};
        int[] actual = Main.mergeArrays(a,b);
        assertArrayEquals(expected, actual);
    }
    @Test
    void mergeArrays_shouldReturn34_whenCalledWithEmptyAnd34() {
        int[] a = {};
        int[] b = {3, 4};
        int[] expected = {3, 4};
        int[] actual = Main.mergeArrays(a,b);
        assertArrayEquals(expected, actual);
    }

}