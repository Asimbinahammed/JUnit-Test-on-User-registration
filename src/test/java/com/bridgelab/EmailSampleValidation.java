package com.bridgelab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmailSampleValidation {

    //testing all email samples
    @Test
    public void testingMail1() {
        UserValidator validator = new UserValidator();
        boolean result1 = validator.validateEmailAddress("abc@yahoo.com");
        Assertions.assertEquals(true, result1);//Test will be pass
    }

    @Test
    public void testingMail2() {
        UserValidator validator = new UserValidator();
        boolean result2 = validator.validateEmailAddress("abc-100@yahoo.com");
        Assertions.assertEquals(true, result2);//Test will be pass
    }

    @Test
    public void testingMail3() {
        UserValidator validator = new UserValidator();
        boolean result3 = validator.validateEmailAddress("abc111@abc.com");
        Assertions.assertEquals(true, result3);//Test will be pass
    }

    @Test
    public void testingMail4() {
        UserValidator validator = new UserValidator();
        boolean result4 = validator.validateEmailAddress("abc-100@abc.net");
        Assertions.assertEquals(true, result4);//Test will be pass
    }

    @Test
    public void testingMail5() {
        UserValidator validator = new UserValidator();
        boolean result5 = validator.validateEmailAddress("abc.100@abc.com.au");
        Assertions.assertEquals(true, result5);//Test will be pass
    }

    @Test
    public void testingMail6() {
        UserValidator validator = new UserValidator();
        boolean result6 = validator.validateEmailAddress("abc@1.com");
        Assertions.assertEquals(true, result6);//Test will be pass
    }

    @Test
    public void testingMail7() {
        UserValidator validator = new UserValidator();
        boolean result7 = validator.validateEmailAddress("abc@gmail.com.com");
        Assertions.assertEquals(true, result7);//Test will be pass
    }

    @Test
    public void testingMail8() {
        UserValidator validator = new UserValidator();
        boolean result8 = validator.validateEmailAddress("abc");
        Assertions.assertEquals(true, result8);//Test will be fail
    }

    @Test
    public void testingMail9() {
        UserValidator validator = new UserValidator();
        boolean result9 = validator.validateEmailAddress("abc@.com.my");
        Assertions.assertEquals(true, result9);//Test will be fail
    }

}