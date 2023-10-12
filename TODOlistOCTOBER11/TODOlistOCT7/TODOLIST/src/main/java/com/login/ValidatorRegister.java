package com.login;

public class ValidatorRegister {

    public static boolean isValidDate(String name) {
        return name.length() < 2 || name.length() > 30;
    }

    public static boolean isValidPassword(String password) {
        return password.length() >= 6;
    }

    public static boolean isValidEmail(String email) {
        return email.matches("^[A-Za-z0-9_.]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
    }
    public static boolean arePasswordsEqual(String password, String confirmPassword) {
        return password.equals(confirmPassword);
    }
}
