package com.cxf.HelloDemo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by JetWang on 2016/11/29.
 */

@WebService(name = "HelloWS ",
    targetNamespace = "http://www.tmp.com/services/hello"
)
public interface HelloWS {
    @WebMethod
    String welcome(@WebParam(name = "name") String name);
}
