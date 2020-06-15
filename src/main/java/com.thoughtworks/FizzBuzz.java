package com.thoughtworks;

public class FizzBuzz {

    public String say(int number) {
        String result = "";
        if (String.valueOf(number).contains("7")) {
            if (String.valueOf(number).contains("5")) {
                if (number % 3 == 0) {
                    result += "Fizz";
                }
                if (number % 7 == 0) {
                    result += "Whizz";
                }
                if (result.equals("")) {
                    result = String.valueOf(number);
                }
                return result;
            }
            return contain_3(number);
        }
        return contain_5(number);
    }

    public String contain_5(int number_C) {
        String result_C = "";
        if (String.valueOf(number_C).contains("5")) {
            if (number_C % 5 == 0) {
                result_C += "Buzz";
            }
            if (number_C % 7 == 0) {
                result_C += "Whizz";
            }
            if (result_C.equals("")) {
                result_C = String.valueOf(number_C);
            }
            return result_C;
        }
        return contain_3(number_C);
    }

    public String contain_3(int number_B) {
        if (String.valueOf(number_B).contains("3")) {
            return "Fizz";
        }
        return simple_Fizz_Buzz_Whizz(number_B);
    }

    public String simple_Fizz_Buzz_Whizz(int number_A) {
        String result_A = "";
        if (String.valueOf(number_A).contains("3")) {
            return "Fizz";
        }
        if (number_A % 3 == 0) {
            result_A += "Fizz";
        }
        if (number_A % 5 == 0) {
            result_A += "Buzz";
        }
        if (number_A % 7 == 0) {
            result_A += "Whizz";
        }
        if (result_A.equals("")) {
            result_A = String.valueOf(number_A);
        }
        return result_A;
    }
}
