package com.cxf.HelloDemo.impl;

import com.cxf.HelloDemo.HelloWS;

import javax.jws.WebService;

/**
 * Created by JetWang on 2016/11/29.
 */
@WebService(
        endpointInterface = "com.cxf.HelloDemo.HelloWS",//实现接口的地方
        portName = "HelloWSPort",
        serviceName = "HelloWSService",
        targetNamespace = "http://www.tmp.com/services/hello"
)
public class HelloWSImpl  implements HelloWS{

    @Override
    public String welcome(String name) {
        return "Welcome " + name;
    }
}
