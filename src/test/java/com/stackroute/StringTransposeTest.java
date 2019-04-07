package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class StringTransposeTest {
    private static StringTranspose stringTranspose;
    @BeforeClass
    public static void setup()
    {
        stringTranspose= new StringTranspose();
    }
    @AfterClass
    public static void Teardown()
    {
        stringTranspose= null;
    }
    @Test
    public void transposetest(){
        assertEquals("transpose() returned incorrect values()",
                "a kciuq nworb xof spmuj revo eht yzal god",
                stringTranspose.transpose("a quick brown fox jumps over the lazy dog"));
    }
    @Test
    public void transposetestFailure(){
        assertNotNull("transpose() returned incorrect values()",
                stringTranspose.transpose("hello world"));
    }
    @Test
    public void transposeCase(){
        assertEquals("transpose() returned incorrect values()",
                "i ma htnawsaj",
                stringTranspose.transpose("I am jaswanth"));
    }

}
