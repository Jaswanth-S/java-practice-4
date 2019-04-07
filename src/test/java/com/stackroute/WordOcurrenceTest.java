package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class WordOcurrenceTest
 {
    private static WordOcurrence wordOcurrence;
    @BeforeClass
    public static void setup()
    {
        wordOcurrence = new WordOcurrence();
    }
    @AfterClass
    public static void Teardown()
    {
        wordOcurrence = null;
    }
    @Test
    public void wordCounttest()
    {
        assertArrayEquals("wordCount() returned incorrect values",new String [] {"4-6","10-12","27-29"},
                wordOcurrence.wordCount("She sells seashells by the seashore","se"));
    }
    @Test
    public void  wordCounttestFailure()
    {
        assertNull("wordCount() returned incorrect values",
                wordOcurrence.wordCount("","se"));
    }

}