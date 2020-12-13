package com.nicai.learnjava11.hello;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * HelloImplTest
 */
class HelloImplTest {

    @Test
    void hello() {
        Hello hello = new HelloImpl();
        hello.hello("jay");
        Assertions.assertTrue(true);
    }
}