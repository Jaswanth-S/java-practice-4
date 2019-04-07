package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountCharacterTest
{
    private static CountCharacter countCharacter;
    @BeforeClass
    public static void setup()
    {
        countCharacter = new CountCharacter();
    }
    @AfterClass
    public static  void Teardown()
    {
        countCharacter=null;
    }
    @Test
    public void testCharacterCount()
    {
        assertEquals("countCharacter() returned incorrect values",15,countCharacter.countCharacter("Java is java again java again count number of occurrence of a in the given Again Java","a"));
    }
    @Test
    public void testCharacterCountFailure(){
        assertNotEquals("countCharacter() returned incorrect values",0,countCharacter.countCharacter("abcdefghijk","b"));
    }
    @Test
    public void testCountNull(){
        assertEquals("countCharacter() returned incorrect values",0,countCharacter.countCharacter("","j"));
    }

}
