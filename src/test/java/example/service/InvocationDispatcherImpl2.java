package example.service;

import com.github.wang839876392.spring.httpsub.annotation.ProxyStub;
import com.github.wang839876392.spring.httpsub.proxy.AbstractInvocationDispatcher;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * CreatedDate: 2020/11/24
 * Author: swift
 */
@Component
public class InvocationDispatcherImpl2 extends AbstractInvocationDispatcher<ProxyStub, Void> {
    @Override
    protected Object invoke(StubProxyContext<ProxyStub> stubProxyContext, Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("InvocationDispatcherImpl2");
        return "InvocationDispatcherImpl2";
    }
}
