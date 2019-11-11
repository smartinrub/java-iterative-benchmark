# java-iterative-benchmark
## How to run
```bash
mvn clean install
java -jar target/benchmar.jar
```
## Results

Benchmark  | Score
------------- | -------------
for Loop  |  8.437 ns/op
Tail Recursion  | 15.500 ns/op
Recursion  | 16.887 ns/op
stream  | 76.064  ns/op

## Set up

- CPU: 1.4GHz quad-core Intel Core i5, Turbo Boost up to 3.9GHz
- OS: macOS Catalina
- Factorial: 20