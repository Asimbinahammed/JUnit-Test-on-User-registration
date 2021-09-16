package com.bridgelab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JUnitAssertionTest {
    //Name Written in Proper way
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Asim");
        Assertions.assertEquals(true, result);
    }

    //Name Written in LowerCase for Testing
    @Test
    public void givenFirstName_WhenFirsLetterSmall_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("asim");
        Assertions.assertFalse(result);
    }

    //Name Written Less Than 3 Character
    @Test
    public void givenFirstName_WhenLessThanThreeCharacter_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("As");
        Assertions.assertFalse(result);
    }

    //Testcase for special Characters
    @Test
    public void givenFirstName_WhenSpCharacters_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("as@#$");
        Assertions.assertFalse(result);
    }

    //Last Name In Proper Way
    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("Ahammed");
        Assertions.assertEquals(true, result);
    }

    //Test for Lowercase
    @Test
    public void givenLastName_WhenLowerCase_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("ahammed");
        Assertions.assertFalse(result);
    }

    //Test for less than 3 character
    @Test
    public void givenLastName_WhenLessThanThreeCharacter_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("ah");
        Assertions.assertFalse(result);
    }

    //Test for Special Character
    @Test
    public void givenLastName_WhenSpecialCharacter_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("ah@#$%");
        Assertions.assertFalse(result);
    }

    //Test for Email Should Return True
    @Test
    void givenEmailAddress_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmailAddress("asim123@gmail.com");
        Assertions.assertEquals(true, result);
    }

    //Test for invalid Email
    @Test
    void givenEmailAddress_WhenWrong_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmailAddress("abc@.com.my");
        Assertions.assertFalse(result);
    }

    //Test for valid Mobile Number Should Return True
    @Test
    public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validatePhoneNumber("91 1234567890");
        Assertions.assertTrue(result);
    }

    //Test for Invalid Mobile Number Should return false
    @Test
    public void givenPhoneNumber_WhenNoSpaceFollow_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validatePhoneNumber("911234567890");
        Assertions.assertFalse(result);
    }

    //Test for less than 10 digit Number Should return false
    @Test
    public void givenPhoneNumber_WhenLessThanTenDigit_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validatePhoneNumber("91 159784");
        Assertions.assertFalse(result);
    }

    //Test for Valid Password Should Return True ( minimum 8 Character)
    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validatePassword("12345678");
        Assertions.assertTrue(result);
    }

    //Test for Password Without eight letters Should Return False
    @Test
    void givenPassword_WhenWithoutUppercaseCharacters_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validatePassword("a122");
        Assertions.assertFalse(result);
    }

    //Test for password one capital letter should return True
    @Test
    void givenPassword_WhenWithOneCapital_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validatePassword("A1234567");
        Assertions.assertTrue(result);
    }

    //Test for password without capital letter should return false
    @Test
    void givenPassword_WhenWithoutOneCapital_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validatePassword("12345678");
        Assertions.assertFalse(result);
    }

    //Test for password one number should return true
    @Test
    void givenPassword_WhenWithOneNumeric_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validatePassword("Asim12334");
        Assertions.assertTrue(result);
    }

    //Test for password one number should return true
    @Test
    void givenPassword_WhenWithoutOneNumeric_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validatePassword("Asimasdf");
        Assertions.assertFalse(result);
    }

    //Test for password one special character should return true
    @Test
    void givenPassword_WhenWithOneSpecialChara_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validatePassword("Asim@1334");
        Assertions.assertTrue(result);
    }

    //Test for password one number should return true
    @Test
    void givenPassword_WhenWithoutOneSpecialCharachters_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validatePassword("Asima4sdf");
        Assertions.assertFalse(result);
    }

}
