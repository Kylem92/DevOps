package com.kyle.devopsTests;
import com.kyle.devops.CA2;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnitTests {
    @Test
    public void testDOB()
    {
        String dob = "24-11-1992";
        assertEquals(true, CA2.dobValidator(dob));
    }
}
