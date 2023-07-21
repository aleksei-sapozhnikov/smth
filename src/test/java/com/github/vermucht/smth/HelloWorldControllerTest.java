package com.github.vermucht.smth;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class HelloWorldControllerTest {
  @InjectMocks private HelloWorldController controller;

  @Test
  void GetHelloWorld() {
    Assertions.assertEquals("Hello, someName", controller.hello("someName"));
  }
}
