package com.mikemybytes.junit;

import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks the annotated test class as eligible for parallel execution. Unlike the {@link Execution},
 * it can be used only on the test class level, so all the test methods inside such a class would
 * still be run sequentially.
 */
@Execution(ExecutionMode.CONCURRENT)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ParallelizableTest {}
