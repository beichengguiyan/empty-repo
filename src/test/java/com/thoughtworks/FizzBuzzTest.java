package com.thoughtworks;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class FizzBuzzTest {

    @Test
    public void should_return_1_when_given_1(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result =  fizzBuzz.say(1);
        //then
        Assert.assertThat(result,is("1"));
    }
    @Test
    public void should_return_Fizz_when_given_3(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result =  fizzBuzz.say(3);
        //then
        Assert.assertThat(result,is("Fizz"));
    }
    @Test
    public void should_return_Buzz_when_given_5(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result =  fizzBuzz.say(5);
        //then
        Assert.assertThat(result,is("Buzz"));
    }
    @Test
    public void should_return_FizzBuzz_when_given_15(){
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result =  fizzBuzz.say(15);
        //then
        Assert.assertThat(result,is("FizzBuzz"));
    }
}