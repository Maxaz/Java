import static org.junit.Assert.*;

public class UtilitiesTest {

    private Utilities utilities;

    @org.junit.Before
    public void setup() {
        utilities = new Utilities();
    }

    @org.junit.Test
    public void everyNthChar() throws Exception{
        assertArrayEquals(new char[]{'e','l'},utilities.everyNthChar("hello".toCharArray(),2));
        assertArrayEquals(new char[]{'h','e','l','l','o'},utilities.everyNthChar("hello".toCharArray(),9));
    }

    @org.junit.Test
    public void removePairs() throws Exception {
        assertEquals("ABCDEF", utilities.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", utilities.removePairs("ABCCABDEEF"));
        assertEquals("A", utilities.removePairs("A"));
        assertEquals("", utilities.removePairs(""));
        assertNull("null returned when passed null", utilities.removePairs(null));
    }

    @org.junit.Test
    public void converter() {
        assertEquals(300, utilities.converter(10,5));
    }

    @org.junit.Test(expected = ArithmeticException.class)
    public void converter_arithmeticException() {
        utilities.converter(10,0);
    }

    @org.junit.Test
    public void nullIfOddLength() {
        assertNull("null returned when odd length", utilities.nullIfOddLength("ABC"));
        assertEquals("ABCD",utilities.nullIfOddLength("ABCD"));
    }
}