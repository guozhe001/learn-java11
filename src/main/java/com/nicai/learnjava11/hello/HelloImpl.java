package com.nicai.learnjava11.hello;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class HelloImpl implements Hello {

    private Runnable runnable;

    @Override
    public void hello(String name) {
        log.info("hello, {}", name);
        var alist = Arrays.asList("a");
        for (String element : alist) {

        }
        runnable = new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub

            }
        };
    }

}
