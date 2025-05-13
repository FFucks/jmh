/*
package jmh;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@State(Scope.Thread)
public class SimpleBenchmark {

    private static final int ARRAY_SIZE = 1_000_000;
    private int[] data;

    */
/**
     * Setup method to initialize data for the benchmark.
     *//*

    @Setup(Level.Trial)
    public void setup() {
        data = new int[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            data[i] = i;
        }
    }

    */
/**
     * Benchmark method to sum the array using a loop.
     *
     * @return The sum of the array elements
     *//*

    @Benchmark
    public long sumUsingLoop() {
        long sum = 0;
        for (int value : data) {
            sum += value;
        }
        return sum;
    }

    */
/**
     * Benchmark method to sum the array using streams.
     *
     * @return The sum of the array elements
     *//*

    @Benchmark
    public long sumUsingStreams() {
        return java.util.Arrays.stream(data).sum();
    }

    */
/**
     * Main method to run the benchmark.
     *
     * @param args Command line arguments
     * @throws Exception If an error occurs during benchmark execution
     *//*

    public static void main(String[] args) throws Exception {
        org.openjdk.jmh.Main.main(args);
    }
}
*/
