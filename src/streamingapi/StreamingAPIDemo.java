package streamingapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamingAPIDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 40, 18, 23, 30, null);
        //System.out.println("Stream filter"+list.stream().filter(x->x%5==0).collect(Collectors.toList()));
        System.out.println("Stream takewhile" + list.stream().takeWhile(x -> x % 5 == 0).collect(Collectors.toList()));

        System.out.println("Stream dropwhile" + list.stream().dropWhile(x -> x % 5 == 0).collect(Collectors.toList()));

        System.out.println("Stream ofNullable" + list.stream().flatMap(x -> Stream.ofNullable(x)).collect(Collectors.toList()));
    }
}
