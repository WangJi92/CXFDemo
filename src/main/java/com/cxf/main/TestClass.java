package com.cxf.main;

import com.cxf.HelloDemo.HelloWS;
import com.cxf.HelloDemo.impl.HelloWSImpl;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

/**
 * Created by JetWang on 2016/11/29.
 */
public class TestClass {

    public static void main(String[] args) {
        JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
        factory.setServiceClass(HelloWS.class);
        //服务发布的地址
        factory.setAddress("http://localhost:8000/services/hello");
        factory.setServiceBean(new HelloWSImpl());
        factory.create();
    }
}
