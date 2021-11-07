# junit5-parallel-tests

Run tests in parallel:
```
mvn clean verify
```

Run tests sequentially:
```
mvn -Djunit.jupiter.execution.parallel.enabled=false clean verify
```
