package com.hello;

import javax.jws.WebMethod;
import javax.jws.WebService;
@WebService
public interface hello {

    @WebMethod
    public String getName(String name);
}
