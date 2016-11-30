package com.hello.impl;

import com.hello.hello;

import javax.jws.WebService;

@WebService(endpointInterface = "com.hello.impl.helloImpl"
)
public class helloImpl implements hello {

    public String getName(String name) {
        return null;
    }
}
