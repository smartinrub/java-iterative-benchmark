package org.smartinrub.javaiterativebenchmark;

import java.util.concurrent.TimeUnit;
import java.util.stream.LongStream;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Warmup;


@Fork(warmups = 2, value = 2)
@Warmup(iterations = 3, time = 2, timeUnit = TimeUnit.SECONDS)
@BenchmarkMode(value = Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Measurement(iterations = 3, time = 2, timeUnit = TimeUnit.SECONDS)
public class BenchMark {

	@Benchmark
	public void tailRecursive() {
		factorialTailRecursive(20);
	}
	
	@Benchmark
	public void stream() {
		factorialStream(20);
	}
	
	@Benchmark
	public void forLoop() {
		factorialForLoop(20);
	}
	
	@Benchmark
	public void recursive() {
		factorialRecursive(20);
	}

	public long factorialTailRecursive(long num) {
		return factorial(1, num);
	}

	public long factorial(long result, long val) {
		return val == 1 ? result : factorial(result * val, val - 1);
	}
	
	public long factorialStream(long number) {
		return LongStream.rangeClosed(1, number)
				.reduce(1, (n1, n2) -> n1 * n2);
	}
	
	public long factorialForLoop(long number) {
		long result = 1;
		for (; number > 0; number--) {
			result *= number;
		}
		return result;
	}
	
	public long factorialRecursive(long number) {
		return number == 1 ? 1 : number * factorialRecursive(number - 1);
	}
}
