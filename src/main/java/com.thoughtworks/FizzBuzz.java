package com.thoughtworks;

public class FizzBuzz {

    public String say(int number) {
        String result = "";
        if (String.valueOf(number).contains("5")) {
            if (number % 5 == 0) {
                result += "Buzz";
            }
            if (number % 7 == 0) {
                result += "Whizz";
            }
            if (result.equals("")) {
                result = String.valueOf(number);
            }
            return result;
        } else {
            if (String.valueOf(number).contains("3")) {
                return "Fizz";
            }
            if (number % 3 == 0) {
                result += "Fizz";
            }
            if (number % 5 == 0) {
                result += "Buzz";
            }
            if (number % 7 == 0) {
                result += "Whizz";
            }
            if (result.equals("")) {
                result = String.valueOf(number);
            }
            return result;
        }
    }
}
