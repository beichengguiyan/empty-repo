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
}
