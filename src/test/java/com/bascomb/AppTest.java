package com.bascomb;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        Singleton s1 = Singleton.getSingleInstance();
        //System.out.println(s1.str);
        Singleton s2 = Singleton.getSingleInstance();
        assertTrue( s1 != null && s1 == s2);
    }

}
