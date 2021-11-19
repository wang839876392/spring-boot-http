package example.service;


import com.github.wang839876392.spring.httpsub.annotation.ProxyStub;

/**
 * CreatedDate: 2020/11/24
 * Author: swift
 */
@ProxyStub(InvocationDispatcherImpl2.class)
public interface HelloService2 {
    String hello();
}
