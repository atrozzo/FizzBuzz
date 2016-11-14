import com.at.fizzbuzz.FizzBuzz;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by angelo on 14/11/2016.
 */

public class FizzBuzzTest {

    private FizzBuzz fizzbuzz;

    @Before
    public void init(){
        fizzbuzz = new FizzBuzz();
    }



    @Test
    public void returnsNumbers() throws Exception {
        assertEquals("1", fizzbuzz.of(1));
        assertEquals("2", fizzbuzz.of(2));
    }

    @Test public void returnsFizzWhenNumberIsMultipleOfThree() throws Exception {
        assertEquals("fizz", fizzbuzz.of(6));
        assertEquals("fizz", fizzbuzz.of(9));
    }

    @Test public void returnsFizzWhenNumberIsMultipleOfFive() throws Exception {
        assertEquals("buzz", fizzbuzz.of(5));
        assertEquals("buzz", fizzbuzz.of(10));
    }


    @Test
    public void returnsFizzBuzzWhenNumberIsMultipleOfThreeAndFive() throws Exception {
        assertEquals("fizzbuzz", fizzbuzz.of(15));
    }


    @Test public void returnsLuckyWhenNumberContainsThree() throws Exception {
        assertEquals("lucky", fizzbuzz.of(3));
    }

    @Test
    public void returnOnlyNumberOccrences() throws  Exception{
        fizzbuzz.of(1);
        assertTrue(fizzbuzz.getNumberOccurrences() == 1 );
    }


    @Test
    public void returnNoNumberOccurrences() throws  Exception{
        fizzbuzz.of(3);
        assertTrue(fizzbuzz.getNumberOccurrences() == 0 );
    }


    @Test
    public void returnFizzOccurences() throws  Exception{
        fizzbuzz.of(6);
        fizzbuzz.of(9);
        assertTrue(fizzbuzz.getStringOccurences("fizz") == 2 );
    }


    @Test
    public void returnBuzzOccurences() throws  Exception{
        fizzbuzz.of(5);
        fizzbuzz.of(10);
        assertTrue(fizzbuzz.getStringOccurences("buzz") == 2 );
    }


}
