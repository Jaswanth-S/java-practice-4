package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class WordSortTest {
    private static WordSort wordSort;
    @BeforeClass
    public static void setup()
    {
        wordSort = new WordSort();
    }
    @AfterClass
    public static void Teardown()
    {
        wordSort = null;
    }
    @Test
    public void testSort(){
        assertArrayEquals("sortString() returned incorrect values",
                new String[]{"am","i","in","stackroute","working"},
                wordSort.sortString("I am working in stackroute"));
        assertArrayEquals("sortString() returned incorrect values",
                new String[]{"am","banglore","i","in","living"},
                wordSort.sortString("I am living in banglore"));
    }
    @Test
    public void testSortFailure(){
        assertNotNull("sortString() returned incorrect values",
                wordSort.sortString("My name is jaswanth"));
    }
}
