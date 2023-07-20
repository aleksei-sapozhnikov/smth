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
    System.out.println(System.getenv("ENV_VAR"));
    System.out.println(System.getenv("REPO_VARIABLE"));
    System.out.println(System.getenv("REPO_SECRET"));

    if (!"true".equals(System.getenv("IS_TEST_ENVIRONMENT"))) {
      return;
    }
    Assertions.assertTrue(isNotEmpty(System.getenv("ENV_VAR")));
    Assertions.assertEquals("Repository variable", System.getenv("REPO_VARIABLE"));
    Assertions.assertEquals("Repository secret", System.getenv("REPO_VARIABLE"));
  }

  private static boolean isNotEmpty(String envVar) {
    return envVar != null && envVar.length() > 0;
  }
}
