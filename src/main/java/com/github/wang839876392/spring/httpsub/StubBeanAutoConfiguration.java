package com.github.wang839876392.spring.httpsub;

import com.github.wang839876392.spring.httpsub.proxy.DefaultStubProxyFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * CreatedDate: 2020/11/24
 * Author: swift
 */
@Configuration
public class StubBeanAutoConfiguration {
    @Bean
    public StubDefPostProcessor stubBeanFactoryPostProcessor() {
        return new StubDefPostProcessor();
    }

    @Bean
    public StubBeanPostProcessor stubBeanPostProcessor() {
        return new StubBeanPostProcessor();
    }

    @Bean
    public DefaultStubProxyFactory defaultStubProxyFactory() {
        return new DefaultStubProxyFactory();
    }
}
