package uk.co.capitalone.luhncheck.components;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CreditCardValidatorTest {

    private CreditCardValidator creditCardValidator = new CreditCardValidator();

    @Test
    // show basic version and then show parameterised way
    void isValidCardNumberLengthReturnsTrueWhenLengthIsValid(){
        // your code should go inside the brackets below where true is
        assertTrue(true);
    }

    @Test
    void isValidCardNumberLengthReturnsFalseWhenLengthIsInvalid(){
    }

    @Test
    void checkInvalidCardLengthThrowsException(){
    }

    @Test
    void checkValidCardLengthDoesNotThrowException(){
    }

    @Test
    void checkLuhnSumReturnsCorrectValue(){
    }

}
