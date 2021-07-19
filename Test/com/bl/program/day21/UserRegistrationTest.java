package com.bl.program.day21;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserRegistrationTest {

    @Test
    public void firstNameValidator() throws CustomException {
        try {
            String firstName = "Dipali";
            assertEquals(true,  UserRegistration.firstNameValidator(firstName));
        }catch(CustomException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void lastNameValidator() throws CustomException {
        try {
            String lastName = "Magare";
            assertEquals(true,  UserRegistration.lastNameValidator(lastName));
        }catch(CustomException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void contactNumber() throws CustomException {
        try {
            String contactNumber = "91 9130854286";
            assertEquals(true,  UserRegistration.lastNameValidator(contactNumber));
        }catch(CustomException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void paswwordValidator() throws CustomException {
        try {
            String password = "Dipali$23";
            assertEquals(true,  UserRegistration.paswwordValidator(password));
        }catch(CustomException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void emailValidator() throws CustomException {
        try {
            String email = "dipalimagare26@gmail.com";
            assertEquals(true,  UserRegistration.emailValidator(email));
        }catch(CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}