package immutablecollections;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.Map.entry;

public class Demo {
    public static void main(String[] args) {

        List<String> list = List.of("abc", "xyz", "123");
        Set.of("abc", "xyz", "123");
        Map.of('a', "abc", 'b', "bcd", 3, "cde");
        Map.ofEntries(entry(2, new String("2 is the key")), entry(3, "3 is the key"));


    }
}
