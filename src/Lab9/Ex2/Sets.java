package Lab9.Ex2;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Sets {
    public static LinkedHashSet<String> minusDoubles(String[] sourceArray) {
        return new LinkedHashSet<>(Arrays.asList(sourceArray));
    }

    public static LinkedHashSet<Integer> minusDoubles(Integer[] sourceArray) {
        return new LinkedHashSet<>(Arrays.asList(sourceArray));
    }

    public static LinkedHashSet<Double> minusDoubles(Double[] sourceArray) {
        return new LinkedHashSet<>(Arrays.asList(sourceArray));
    }
}
