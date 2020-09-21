package com.thoughtworks.basic;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class ArgsTest {
    @Test
    public void should_return_error_flag_when_input_flag_no_blank_space() {
        //given
        String inputString = "-p-d";
        Args args = new Args(inputString);

        //when

        //then
        Assert.assertEquals(false,args.checkInputFlagNOBlankSpace());
    }

    @Test
    public void should_return_error_flag_when_repeat_flag() {
        //given
        String inputString = "-l true -l true";
        Args args = new Args(inputString);

        //when

        //then
        Assert.assertEquals(false,args.checkInputFlagRepeat());

    }

    @Test
    public void should_return_value_or_default_value_when_input_legal_flag_and_value() {
        //given
        String inputString = "-l true -p 8080 -d";
        Args args = new Args(inputString);


        //when
        String argsOutput = args.getValueOf();

        //then
        Assert.assertEquals("flag:l value:true;" +
                "flag:p value:8080;" +
                "flag:d value: ;",argsOutput);
    }
}
