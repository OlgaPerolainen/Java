package Lab9.Ex2;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Sets {
    public static Set<String> minusDoubles(String[] sourceArray) {
        return new LinkedHashSet<>(Arrays.asList(sourceArray));
    }

    public static Set<Integer> minusDoubles(Integer[] sourceArray) {
        return new LinkedHashSet<>(Arrays.asList(sourceArray));
    }

    public static Set<Double> minusDoubles(Double[] sourceArray) {
        return new LinkedHashSet<>(Arrays.asList(sourceArray));
    }
}
