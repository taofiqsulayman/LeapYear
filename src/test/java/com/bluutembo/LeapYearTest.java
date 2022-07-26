package com.bluutembo;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeapYearTest {
    @Test
    public void is2001aLeapYear(){
        LeapYearChecker checker = new LeapYearChecker();

        assertEquals(false, checker.isLeapYear(2001));
    }

    @Test
    public void is1996aLeapYear(){
        LeapYearChecker checker = new LeapYearChecker();

        assertEquals(true, checker.isLeapYear(1996));
    }

    @Test
    public void is1900aLeapYear(){
        LeapYearChecker checker = new LeapYearChecker();

        assertEquals(false, checker.isLeapYear(1900));
    }
}
