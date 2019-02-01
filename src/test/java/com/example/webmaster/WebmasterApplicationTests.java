package com.example.webmaster;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = WebmasterApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class WebmasterApplicationTests {

    @Test
    public void contextLoads() {
    }

}

