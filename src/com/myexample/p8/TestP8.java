package com.myexample.p8;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestP8 {
    Main testMain;
    Runnable r1;
    Runnable r2;

    @Before
    public void setUp() throws Exception {
        testMain = new Main();
        r1 = new MyRunnable();
        r2 = new MyRunnable();
    }

    @Test
    public void testMain () throws InterruptedException {
        testMain.run(r1, r2);
        assertTrue(testMain.getThread1().getState().equals(Thread.State.TERMINATED));
        assertFalse(testMain.getThread2().getState().equals(Thread.State.TERMINATED));
    }


}
