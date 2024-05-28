package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootTest
@WebAppConfiguration
public class IntegrationTest {

    @Test
    public void contextLoads() {
        System.out.println("Hello World");
    }
}
