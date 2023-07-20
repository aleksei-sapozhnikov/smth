package com.github.vermucht.smth;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SmthApplicationTests {

  @Test
  void contextLoads() {}

  /** Checks if all needed environment variables are set. Appeared on studying GitHub Actions. */
  @Test
  void envVarIsSet() {
    String isCheck = System.getenv("IS_TEST_ENVIRONMENT");
    if (!"true".equals(isCheck)) {
      return;
    }
    String envVar = System.getenv("ENV_VAR");
    Assertions.assertTrue(envVar != null && envVar.length() > 0);
  }
}
