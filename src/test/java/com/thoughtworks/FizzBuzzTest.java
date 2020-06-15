package com.thoughtworks;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class FizzBuzzTest {

    @Test
    public void should_return_1_when_given_1() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.say(1);
        //then
        Assert.assertThat(result, is("1"));
    }

    @Test
    public void should_return_Fizz_when_given_3() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.say(3);
        //then
        Assert.assertThat(result, is("Fizz"));
    }

    @Test
    public void should_return_Buzz_when_given_5() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.say(5);
        //then
        Assert.assertThat(result, is("Buzz"));
    }

    @Test
    public void should_return_FizzBuzz_when_given_60() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.say(60);
        //then
        Assert.assertThat(result, is("FizzBuzz"));
    }

    @Test
    public void should_return_Whizz_when_given_7() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.say(7);
        //then
        Assert.assertThat(result, is("Whizz"));
    }

    @Test
    public void should_return_BuzzWhizz_when_given_70() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.say(70);
        //then
        Assert.assertThat(result, is("BuzzWhizz"));
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_given_210() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.say(210);
        //then
        Assert.assertThat(result, is("FizzBuzzWhizz"));
    }

    @Test
    public void should_return_Fizz_when_given_13() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.say(13);
        //then
        Assert.assertThat(result, is("Fizz"));
    }

    @Test
    public void should_return_BuzzWhizz_when_given_35() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.say(35);
        //then
        Assert.assertThat(result, is("BuzzWhizz"));
    }

    @Test
    public void should_return_Fizz_when_given_75() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.say(75);
        //then
        Assert.assertThat(result, is("Fizz"));
    }

    @Test
    public void should_return_Fizz_when_given_753() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.say(753);
        //then
        Assert.assertThat(result, is("Fizz"));
    }
}