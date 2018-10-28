package com.example.android.soonami;

public class MyException {
    public static void main(String[] args) {
        String name = "Test Person";
        int age = 19;
        boolean isValidAge = false;

        try {
            isValidAge = isValidAge(age);
        } catch (InvalidAgeException e) {
            e.printStackTrace();
        } finally {
            if (isValidAge) {
                System.out.println("Name:\t" + name);
                System.out.println("Age:\t" + age);
            } else {
                System.out.println("Age is not valid. Please check and try again");
            }
        }
    }

    private static boolean isValidAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age should be 18 or above 18 yrs");
        } else {
            return true;
        }
    }

    public static class InvalidAgeException extends Exception {
        InvalidAgeException(String message) {
            super(message);
        }
    }
}
