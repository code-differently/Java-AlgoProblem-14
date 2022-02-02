package hbcu.stay.ready.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlgoProblem14Test {

    @Test
    public void testOne(){
        AlgoProblem14 algoProblem14 = new AlgoProblem14();

        String expected = "(123) 456-7890";
        long input = 1234567890;
        String actual = algoProblem14.formatPhoneNumber(input);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testTwo(){
        AlgoProblem14 algoProblem14 = new AlgoProblem14();

        String expected = "(519) 555-4468";
        long input = 5195554468L;
        String actual = algoProblem14.formatPhoneNumber(input);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testThree(){
        AlgoProblem14 algoProblem14 = new AlgoProblem14();

        String expected = "(345) 501-2527";
        long input = 3455012527L;
        String actual = algoProblem14.formatPhoneNumber(input);

        Assertions.assertEquals(expected,actual);
    }



}
