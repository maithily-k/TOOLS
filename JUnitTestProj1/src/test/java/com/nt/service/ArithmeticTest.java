package com.nt.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.nt.service.Arithmetic;

public class ArithmeticTest {
	private static Arithmetic ar;
//With proper values
    @Test
    public void TestWithPostives() {
       
        float expected=30.0f;
        float actual=ar.sum(10.0f, 20.0f);
        assertEquals(expected,actual);
        System.out.println("ArithmeticTest.TestWithPostives()");
    }
    //with negatives
    @Test
    public void TestWithNegatives() {
       
       float expected=-30.0f;
        float actual=ar.sum(-10.0f, -20.0f);
        assertEquals(expected,actual);
        System.out.println("ArithmeticTest.TestWithNegatives()");
    }
  //with Zeros
    @Test
    public void TestWithZeros() {
       
       float expected=0.0f;
        float actual=ar.sum(0.0f,0.0f);
        assertEquals(expected,actual);
        System.out.println("ArithmeticTest.TestWithZeros()");
    }
  //with MixedValues
    
    @Disabled
    public void TestWithMixedValues() {
       
       float expected=-10.0f;
        float actual=ar.sum(10.0f,-20.0f);
        assertEquals(expected,actual);
        System.out.println("ArithmeticTest.TestWithMixedValues()");
    }
//    @BeforeEach
//    public void setup() {
//    	System.out.println("ArithmeticTest.setup()");

//    }
//    @AfterEach
//    public void clear() {
//    	System.out.println("ArithmeticTest.clear()");
//    	
//    }
    @BeforeAll
    public static void setupOnce() {
    	System.out.println("ArithmeticTest.setupOnce()");
    	 ar =new Arithmetic();
    }
    @AfterAll
    public static void clearOnce() {
    	System.out.println("ArithmeticTest.clearOnce()");
    	 ar =null;
    }
    
}
