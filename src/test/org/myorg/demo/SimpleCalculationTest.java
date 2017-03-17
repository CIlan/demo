package org.myorg.demo;

import static org.junit.Assert.*;

import org.junit.Test;

import org.myorg.demo.SimpleCalculation;

public class SimpleCalculationTest {

    SimpleCalculation sc = new SimpleCalculation();
    
    @Test
    public void AddTest() {
        
        int c = sc.Add(3, 5);    
        
        assertEquals(8, c);        
    }
}
