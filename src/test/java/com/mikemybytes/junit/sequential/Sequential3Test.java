package com.mikemybytes.junit.sequential;

import com.mikemybytes.junit.TestCaseRunner;
import org.junit.jupiter.api.Test;

import java.time.Duration;

class Sequential3Test {

  @Test
  void runA() {
    TestCaseRunner.runTest(this.getClass(), "A", Duration.ofMillis(750));
  }

  @Test
  void runB() {
    TestCaseRunner.runTest(this.getClass(), "B", Duration.ofMillis(250));
  }

  @Test
  void runC() {
    TestCaseRunner.runTest(this.getClass(), "C", Duration.ofMillis(500));
  }
}