package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class WordFindTest
{
    private static WordFind wordFind;
    @BeforeClass
    public static void setup()
    {
        wordFind = new WordFind();
    }
    @AfterClass
    public static void Teardown()
    {
        wordFind = null;
    }
    @Test
    public void findWordtest(){
        assertEquals("findWord() returned incorrect values",
                true,wordFind.findWord("This is Harry."));
        assertEquals("findWord() returned incorrect values",
                true,wordFind.findWord("Harry potter"));
    }
    @Test
    public void findWordtestFailure(){
        assertEquals("findWord() returned incorrect values",
                false,
                wordFind.findWord("this is Henry"));
    }

    @Test
    public void findWordNotNull()
    {
        assertNotEquals("findWord() returned incorrect values",wordFind.findWord("sample string"));
    }
}
