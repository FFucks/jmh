package jmh;

import org.openjdk.jmh.annotations.*;

import java.io.IOException;
import java.util.regex.Pattern;

@State(Scope.Benchmark)
public class Jmh {

    public static void main(String[] args) throws IOException {
        //Main.main(args);
        org.openjdk.jmh.Main.main(args);
    }

    @Benchmark
    @Fork(value = 1, warmups = 1)
    @Measurement(iterations = 1)
    @BenchmarkMode(Mode.Throughput)
    public String init(){
        return "Hello World !!!";
    }

   /* private String input = "crowd===devoxx";
    private Pattern pattern = Pattern.compile("==");

    @Benchmark
    @Warmup(iterations = 1)
    @Fork(value = 1, warmups = 1)
    public String[] benchOne() {
        return "crowd===devoxx".split("==");
    }

    @State(Scope.Benchmark)
    public static class Log {
        public int x = 8;
    }

    @Benchmark
    public double log(Log input) {
        return Math.log(input.x);
    }

    @Benchmark
    public double foldedLog() {
        return 2.0794415416798357;
    }

   *//* @Benchmark
    public String[] benchTwo() {
        return pattern.split(input, 2);
    }*//*

    @TearDown
    public void tearDownMyBenchMark() {

    }*/


}
