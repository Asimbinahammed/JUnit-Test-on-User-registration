package com.bridgelab;

import com.bridgelab.UserValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodTesting {

    @Test
    public void happyTestCase() throws UserRegistrationException {
        UserValidator validator = new UserValidator();
        boolean resultFirstName = validator.firstNameValidate("Asim");
        Assertions.assertEquals(true, resultFirstName);

        boolean resultLastName = validator.lastNameValidate("Ahammed");
        Assertions.assertEquals(true, resultLastName);

        boolean resultEmail = validator.emailValidator("asim@123.cvv");
        Assertions.assertEquals(true, resultEmail);

        boolean resultPhoneNum = validator.phoneNumberValidator("91 9874563210");
        Assertions.assertEquals(true, resultPhoneNum);

        boolean resultPassword = validator.passwordValidator("Asim@007");
        Assertions.assertEquals(true, resultPassword);
    }

    @Test
    public void sadTestCase() throws UserRegistrationException {
        UserValidator validator = new UserValidator();
        boolean resultFirstName = validator.firstNameValidate("Asim");
        Assertions.assertEquals(true, resultFirstName);

        boolean resultLastName = validator.lastNameValidate("Ahammed");
        Assertions.assertEquals(true, resultLastName);

        boolean resultEmail = validator.emailValidator("asim@123.cvv");
        Assertions.assertEquals(true, resultEmail);

        boolean resultPhoneNum = validator.phoneNumberValidator("91 9874563210");
        Assertions.assertEquals(true, resultPhoneNum);

        boolean resultPassword = validator.passwordValidator("asim@007");//missing a caps causing fail in test case
        Assertions.assertEquals(true, resultPassword);
    }
}