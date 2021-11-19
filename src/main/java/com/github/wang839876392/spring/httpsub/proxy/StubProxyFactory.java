package com.github.wang839876392.spring.httpsub.proxy;


import com.github.wang839876392.spring.httpsub.annotation.ProxyStub;

/**
 * CreatedDate: 2020/11/25
 * Author: swift
 */
public interface StubProxyFactory {

    default Class<?>[] collectProxyInterface(Class<?> interfaceType) {
        return new Class[]{interfaceType, StubProxyLabel.class};
    }

    <T> T createProxy(Class<T> stubInterface, ProxyStub stubAnnotation);
}
