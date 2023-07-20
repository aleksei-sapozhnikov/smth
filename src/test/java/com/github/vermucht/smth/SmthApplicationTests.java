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
    if (!"true".equals(System.getenv("IS_TEST_ENVIRONMENT"))) {
      return;
    }
    Assertions.assertTrue(isNotEmpty(System.getenv("ENV_VAR")));
    Assertions.assertTrue(isNotEmpty(System.getenv("REPO_VARIABLE")));
    Assertions.assertTrue(isNotEmpty(System.getenv("REPO_SECRET")));
    Assertions.assertEquals("Repository variable", System.getenv("REPO_VARIABLE"));
    Assertions.assertEquals("Repository secret", System.getenv("REPO_SECRET"));
  }

  private static boolean isNotEmpty(String envVar) {
    return envVar != null && envVar.length() > 0;
  }
}
