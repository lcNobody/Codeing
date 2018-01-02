package com.l.codeing.Dagger2.sourcecode.test;

/**
 * Description: Test
 * Creator: Cr.L
 * Date: 2017/12/28
 */

public class Test {
    public void test(A a){
        a.b = BFactory.buildB();
    }
}

