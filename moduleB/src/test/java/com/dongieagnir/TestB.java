package com.dongieagnir;

import org.junit.Test;

public class TestB {
    @Test
    public void test2() {
        MyCoolInterface mci = new DefaultMyCoolInterface();
        mci.doStuff();
    }
}
