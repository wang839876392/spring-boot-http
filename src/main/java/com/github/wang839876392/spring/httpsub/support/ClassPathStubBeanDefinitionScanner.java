package com.github.wang839876392.spring.httpsub.support;

import com.github.wang839876392.spring.httpsub.annotation.ProxyStub;
import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.filter.AnnotationTypeFilter;

/**
 * CreatedDate: 2020/11/24
 * Author: swift
 */
public class ClassPathStubBeanDefinitionScanner extends ClassPathBeanDefinitionScanner {

    public ClassPathStubBeanDefinitionScanner(BeanDefinitionRegistry registry, Environment environment) {
        super(registry, true, environment);
    }

    @Override
    protected void registerDefaultFilters() {
        addIncludeFilter(new AnnotationTypeFilter(ProxyStub.class, true, false));
    }

    @Override
    protected boolean isCandidateComponent(AnnotatedBeanDefinition beanDefinition) {
        AnnotationMetadata metadata = beanDefinition.getMetadata();
        return metadata.isInterface() && !metadata.isAnnotation();
    }
}
