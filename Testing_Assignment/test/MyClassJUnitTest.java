/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import testing_assignment.MyClass;

/**
 *
 * @author BiLaL SaBeeL
 */
public class MyClassJUnitTest {
    
    public MyClassJUnitTest() {
    }
    
    
    @Test
    public void testPrimeNumber(){
        MyClass obj=new MyClass();
        int PrimeDigit=199;
        boolean expectedOutput=true;
        assertTrue(obj.primeNumber(PrimeDigit));
    }
    
    @Test
    public void testNotPrimeNumber(){
        MyClass obj=new MyClass();
        int notPrimeDigit=9;
        boolean expectedOutput=false;
        assertFalse(obj.primeNumber(notPrimeDigit));
    }
    
    @Test
    public void testLessThanZero(){
        MyClass obj=new MyClass();
        int notPrimeDigit=-34;
        boolean expectedOutput=false;
        assertEquals(expectedOutput, obj.primeNumber(notPrimeDigit));
    }
    
    @Test
    public void testFectorial(){
        MyClass obj=new MyClass();
        int testDigit=10;
        int expectedOutput=3628800;
        assertEquals(expectedOutput, obj.factorial(testDigit));
    }
    
    @Test
    public void testFectorialLessThanZero(){
        MyClass obj=new MyClass();
        int testDigit=-45;
        int expectedOutput=-1;
        assertEquals(expectedOutput, obj.factorial(testDigit));
    }
    
    @Test
    public void test_GCD_Not_Equla_LCM(){
        MyClass obj=new MyClass();
        int digit1=81;
        int digit2=153;
        assertNotEquals(obj.GCD(digit1, digit2), obj.LCM(digit1, digit2));
    }
    
    @Test
    public void testGCD(){
        MyClass obj=new MyClass();
        int digit1=81;
        int digit2=153;
        int expectedOutput=9;
        assertEquals(expectedOutput,obj.GCD(digit1, digit2));
    }
    
    @Test
    public void testLCM(){
        MyClass obj=new MyClass();
        int digit1=72;
        int digit2=120;
        int expectedOutput=360;
        assertEquals(expectedOutput, obj.LCM(digit1, digit2));
    }
}
