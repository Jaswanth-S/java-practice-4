package com.stackroute;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
public class ReplaceCharacterTest
{
    private static ReplaceCharacter replaceCharacter;
    @BeforeClass
    public static void  setup(){
        replaceCharacter =new ReplaceCharacter();
    }
    @AfterClass
    public static void Teardown(){
        replaceCharacter = null;
    }
    @Test
    public void replaceStringtest(){
        assertEquals("repalceString() returned incorrect values","faity fry",
                replaceCharacter.replaceString("daily dry"));
        assertEquals("repalceString() returned incorrect values","fog",
                replaceCharacter.replaceString("dog"));

        assertEquals("repalceString() returned incorrect values","tamp",
                replaceCharacter.replaceString("lamp"));
    }
    @Test
    public void replaceStringtestFailure(){
        assertNotNull("repalceString() returned incorrect values",
                replaceCharacter.replaceString("sample"));
    }
    @Test
    public void replaceStringCase(){
        assertEquals("repalceString() returned incorrect values","faity",
                replaceCharacter.replaceString("Daily"));
    }
}
