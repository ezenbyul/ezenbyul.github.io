package com.test.junit;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

public class CalcuratorTest2 {

   @Test
   public void testSum(){                                                        
        Calcurator c = new Calcurator();
        double result = c.sum(10, 50);
        assertEquals(60, result, 0);
   }
}
