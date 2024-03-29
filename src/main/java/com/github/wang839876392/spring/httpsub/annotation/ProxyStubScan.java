package com.github.wang839876392.spring.httpsub.annotation;

import com.github.wang839876392.spring.httpsub.StubBeanDefinitionRegistrar;
import org.springframework.context.annotation.Import;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

/**
 * CreatedDate: 2020/11/24
 * Author: swift
 */
@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(StubBeanDefinitionRegistrar.class)
public @interface ProxyStubScan {
    @AliasFor("basePackages")
    String[] value() default {};

    @AliasFor("value")
    String[] basePackages() default {};

    Class<?>[] basePackageClasses() default {};

    /**
     * 标记注解 用于限定扫描的接口
     */
    Class<? extends Annotation> markAnnotation() default Annotation.class;
}
