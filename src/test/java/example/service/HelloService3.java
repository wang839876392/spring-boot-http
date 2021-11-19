package example.service;


import com.github.wang839876392.spring.httpsub.annotation.ProxyStub;

/**
 * CreatedDate: 2020/11/24
 * Author: swift
 */
@ProxyStub(factoryType = StubProxyFactory3.class)
public interface HelloService3 {
    String hello();
}
