package com.bascomb;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit Test
 */
public class AppTest 
{
    /**
     *
     */
    @Test
    public void testClassSingletonIsASingleton()
    {
        Singleton s1 = Singleton.getSingleInstance();
        Singleton s2 = Singleton.getSingleInstance();
        assertTrue( s1 != null && s1 == s2);
    }

}
