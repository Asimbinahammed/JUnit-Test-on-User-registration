package com.bridgelab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class JUnitAssertionTest {
    //Test Method
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Asim");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void givenFirstName_WhenImroper_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("asim");
        Assertions.assertEquals(false, result);
    }
}