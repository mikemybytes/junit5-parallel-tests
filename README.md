# junit5-parallel-tests

An example project illustrating how to use JUnit 5 [parallel 
tests execution](https://junit.org/junit5/docs/current/user-guide/#writing-tests-parallel-execution) 
together with Maven Surefire, following the approach described in 
my article [_Pragmatic test parallelization 
with JUnit 5_](https://mikemybytes.com/2021/11/24/pragmatic-test-parallelization-with-junit5/):

> 1. Enable JUnit 5 parallel tests execution but run everything sequentially by default (status quo).
> 2. Create custom `@ParallelizableTest` annotation promoting class-level parallelization (all the tests methods inside 
will be executed in parallel).
> 3. Enable parallel execution for selected tests starting from unit tests (safe default).

For more details about the approach itself (including the 
motivations behind) just check out the [original blog post](https://mikemybytes.com/2021/11/24/pragmatic-test-parallelization-with-junit5/).

## Requirements
- Java 17+
- Maven 3.8

## Running tests

### In parallel (default)
```
mvn clean verify
```

### Sequentially
```
mvn clean verify -DparallelTests=false
```
