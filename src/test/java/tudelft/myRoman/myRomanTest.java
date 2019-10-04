package tudelft.myRoman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class myRomanTest {

    @BeforeEach
    void initialize() {
        myRoman test = new myRoman();
    }

    @Test
    void singleNumber() {
        myRoman test = new myRoman();
        int result = test.convert("I");

        Assertions.assertEquals(1, result);
    }

    @Test
    void numberWithManyDigits() {
        myRoman test = new myRoman();
        int result = test.convert("VIII");

        Assertions.assertEquals(8, result);
    }

    @Test
    void numberWithSubtractiveNotation() {
        myRoman test = new myRoman();
        int result = test.convert("IV");

        Assertions.assertEquals(4, result);
    }

}
