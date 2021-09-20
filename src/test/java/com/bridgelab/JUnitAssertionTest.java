package com.bridgelab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JUnitAssertionTest {

    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        try {
            Assertions.assertTrue(userValidator.firstNameValidate("Asim"));
        } catch (UserRegistrationException e) {
        }
    }

    @Test
    public void givenFirstName_WhenInvalid_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        try {
            userValidator.firstNameValidate("as");
        } catch (UserRegistrationException e) {
            Assertions.assertEquals("Please enter a valid first name", e.getMessage());
        }
    }

    @Test
    public void givenLastName_WhenValid_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        try {
            Assertions.assertTrue(userValidator.lastNameValidate("Ahammed"));
        } catch (UserRegistrationException e) {
        }
    }

    @Test
    public void givenLastName_WhenInvalid_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        try {
            userValidator.lastNameValidate("ah");
        } catch (UserRegistrationException e) {
            Assertions.assertEquals("Please enter a valid last name", e.getMessage());
        }
    }

    @Test
    public void givenEmailAddress_WhenValid_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        try {
            Assertions.assertTrue(userValidator.emailValidator("asim123@gmail.com"));
        } catch (UserRegistrationException e) {
        }
    }

    @Test
    public void givenEmailAddress_WhenInvalid_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        try {
            userValidator.emailValidator("abc()*@gmail.com");
        } catch (UserRegistrationException e) {
            Assertions.assertEquals("Please enter a valid email id", e.getMessage());
        }
    }

    @Test
    public void givenPhoneNumber_WhenValid_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        try {
            Assertions.assertTrue(userValidator.phoneNumberValidator("919923456789"));
        } catch (UserRegistrationException e) {
        }
    }

    @Test
    public void givenPhoneNumber_WhenInvalid_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        try {
            userValidator.phoneNumberValidator("9825236");
        } catch (UserRegistrationException e) {
            Assertions.assertEquals("Please enter a valid phone number", e.getMessage());
        }
    }

    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        try {
            Assertions.assertTrue(userValidator.passwordValidator("asims@123"));
        } catch (UserRegistrationException e) {
        }
    }

    @Test
    public void givenPassword_WhenInvalid_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        try {
            userValidator.passwordValidator("asims@#$12");
        } catch (UserRegistrationException e) {
            Assertions.assertEquals("Please enter a valid password", e.getMessage());
        }
    }

}
