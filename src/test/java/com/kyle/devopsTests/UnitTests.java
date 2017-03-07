package com.kyle.devopsTests;
import com.kyle.devops.CA2;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnitTests {
    @Test
    public void checkIfDobIsValidTest()
    {
        String dob = "24-11-1992";
        assertEquals(true, CA2.dobValidator(dob));
    }

    @Test
    public void checkDobIsChangedTo10DigitsSuccessfullyIfDobIsInvalidTest()
    {
        String dob = "24-1-1992";
        assertEquals(true, CA2.dobValidator(dob));
    }

    @Test
    public void checkDobDashesInsertedSuccessfullyIfDobDashesIsInvalidTest()
    {
        String dob = "24/11/1992";
        assertEquals(true, CA2.dobValidator(dob));
    }

    @Test
    public void checkDobDayDigitsInsertedSuccessfullyIfDobDigitsIsInvalidTest()
    {
        String dob = "a4-11-1992";
        assertEquals(true, CA2.dobValidator(dob));
    }

    @Test
    public void checkDobMonthDigitsInsertedSuccessfullyIfDobDigitsIsInvalidTest()
    {
        String dob = "24-1e-1992";
        assertEquals(true, CA2.dobValidator(dob));
    }

    @Test
    public void checkDobDayDigitsInsertedWithinRangeIfDobDigitsIsOutOfRangeTest()
    {
        String dob = "38-11-1992";
        assertEquals(true, CA2.dobValidator(dob));
    }

    @Test
    public void checkDobMonthDigitsInsertedWithinRangeIfDobDigitsIsInvalidTest()
    {
        String dob = "24-13-1992";
        assertEquals(true, CA2.dobValidator(dob));
    }
}

