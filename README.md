# java-iterative-benchmark
## How to run
```bash
mvn clean install
java -jar target/benchmar.jar
```
## Results

Benchmark  | Score
------------- | -------------
for Loop  | 12.409 ns/op
Tail Recursion  | 16.570 ns/op
Recursion  | 18.575 ns/op
stream  | 57.499 ns/op

## Set up

- CPU: intel i5-5250U
- OS: Ubuntu 18
- Factorial: 20