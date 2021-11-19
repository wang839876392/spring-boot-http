package example.annotation;


import com.github.wang839876392.spring.httpsub.annotation.ProxyStub;
import example.service.InvocationDispatcherImpl1;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

/**
 * CreatedDate: 2020/11/24
 * Author: swift
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ProxyStub(InvocationDispatcherImpl1.class)
public @interface TestClient {
    @AliasFor(annotation = ProxyStub.class, attribute = "beanName")
    String value() default "";
}
