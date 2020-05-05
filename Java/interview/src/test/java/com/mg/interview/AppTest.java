package com.mg.interview;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest 
{
    @Test
    public void testIs13() {
        App test = new App();
        assertEquals(13, test.getTest());
    }
}
