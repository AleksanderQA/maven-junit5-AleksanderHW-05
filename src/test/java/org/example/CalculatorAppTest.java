package org.example;
import org.junit.jupiter.api.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



public class CalculatorAppTest {

    private Calculator calculator;
    @BeforeEach void setUp (){
        calculator = new Calculator();
        System.out.println("Setting up calculating methods before each test run");
    }


    @Test
    public void sumOfTwoIntegers() {
        int result = calculator.sumOfTwoIntegers(2,5);
        assertEquals(7,result);
    }

    @Test
    public void sumOfTwoNegativeNumbers () {
        int result = calculator.sumOfTwoIntegers(-3,-5);
        assertEquals(-8,result);
     }

    @Test
    public void sumOfTwoNumbers () {
        int result = calculator.sumOfTwoIntegers(10,0);
        assertEquals(10, result);
    }

    @Test
    public void sumOfNegativeAndPositiveNumbers () {
        int result = calculator.sumOfTwoIntegers(-4,8);
        assertEquals(4,result);
    }

    @Test
    public void subtractionOfTwoNumbers() {
        int result = calculator.subtractingOfTwoIntegers(10,5);
        assertEquals (5,result);
    }

    @Test
    public void subtractionOfTwoEqualNumbers() {
        int result = calculator.subtractingOfTwoIntegers(10,10);
        assertEquals(0,result);
    }

    @Test
    public void subtractionOfBiggerAndZeroValues() {
        int result = calculator.subtractingOfTwoIntegers(10,0);
        assertEquals(10,result);
    }

    @Test
    public void subtractionBiggerOfSmallNum() {
        int result  = calculator.subtractingOfTwoIntegers(5,10);
        assertEquals(-5, result);
    }


    @Test
    public void firstNumIsSmallerThanSecond () {
        boolean result = calculator.firstNumIsSmallerThanSecondNum(10,12);
        assertTrue(result);
    }

    @Test
    public void secondNumIsBiggerThanFirst () {
        boolean result = calculator.secondNumIsBiggerThanFirstNum(2,1);
        assertTrue(result);
    }

    @Test
    public void bothNumbersAreEqualToEachOther(){
        boolean result = calculator.sumOfTwoNumbersIsEqlToEachOther(10,10);
        assertTrue(result);
    }

    @Test
    public void firstNumIsNotEqualToSecondNum(){
        boolean result = calculator.firstNumIsNotEqualToSecondNum(5,7);
        assertTrue(result);
    }
}
