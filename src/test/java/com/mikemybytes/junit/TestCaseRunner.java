package com.mikemybytes.junit;

import org.junit.jupiter.api.Assertions;

import java.time.Duration;

public class TestCaseRunner {

  private TestCaseRunner() {
    // static only
  }

  public static void runTest(Class<?> testClass, String testCase, Duration duration) {
    String threadName = Thread.currentThread().getName();
    String testCaseIdentifier = testClass.getSimpleName() + "#" + testCase;

    System.out.println("[" + threadName + "] START: " + testCaseIdentifier);

    try {
      Thread.sleep(duration.toMillis());
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new IllegalStateException("Thread '" + threadName + "' has been interrupted");
    }

    // let's pretend it's a real test
    Assertions.assertEquals(1, 1);

    System.out.println("[" + threadName + "]   END: " + testCaseIdentifier);
  }
}
