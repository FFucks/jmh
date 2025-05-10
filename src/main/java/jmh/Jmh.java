package jmh;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Mode;

import java.io.IOException;

public class Jmh {

    public static void main(String[] args) throws IOException {
        //System.out.println("HEllo");
        //Main.main(args);
        org.openjdk.jmh.Main.main(args);
    }

    @Benchmark
    @Fork(value = 1, warmups = 2)
    @BenchmarkMode(Mode.Throughput)
    public void init(){
        System.out.println("Hello World !!!");
    }

}
