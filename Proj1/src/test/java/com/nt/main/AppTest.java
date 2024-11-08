package com.nt.main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class AppTest {

    @Test
    public void testSumWithPositives() 
    {
    	App app = new App();
    	int expected = 30;
    	int actual = app.sum(10, 20);
    	assertEquals(expected, actual);
    	
    }
    @Test
    public void testSumWithNegatives() 
    {
    	App app = new App();
    	int expected = -30;
    	int actual = app.sum(-10, -20);
    	assertEquals(expected, actual);
    	
    }
    @Test
    public void testSumWithMixedValues() 
    {
    	App app = new App();
    	int expected = -10;
    	int actual = app.sum(10, -20);
    	assertEquals(expected, actual);
    	
    }
}
