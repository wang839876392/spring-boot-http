package example.service;


import example.annotation.TestClient;

/**
 * CreatedDate: 2020/11/24
 * Author: swift
 */
@TestClient("helloService")
public interface HelloService1 {
    String hello();
}
