package com.example.war;

import org.junit.Test;

import com.example.common.HelloWorldCommonTest;

public class HelloWorldWarTest {

    @Test
    public void test() {
        System.out.println(HelloWorldCommonTest.HELLO + " common");
    }

}
