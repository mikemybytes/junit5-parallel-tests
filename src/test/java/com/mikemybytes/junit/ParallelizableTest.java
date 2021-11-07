package com.mikemybytes.junit;

import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Execution(ExecutionMode.CONCURRENT)
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ParallelizableTest {}
