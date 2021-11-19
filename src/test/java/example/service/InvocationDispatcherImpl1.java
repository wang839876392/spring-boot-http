package example.service;

import com.github.wang839876392.spring.httpsub.proxy.AbstractInvocationDispatcher;
import example.annotation.TestClient;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * CreatedDate: 2020/11/24
 * Author: swift
 */
@Component
public class InvocationDispatcherImpl1 extends AbstractInvocationDispatcher<TestClient, Void> {
    @Override
    protected Object invoke(StubProxyContext<TestClient> stubProxyContext, Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("InvocatonDispatcherImpl1");
        return "InvocationDispatcherImpl1";
    }
}
