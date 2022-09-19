package commons;

import java.util.Arrays;

public class PrimitiveArrayWrapper {

  public static Integer[] wrap(int[] primitiveArray) {
    return Arrays.stream(primitiveArray).boxed().toArray(Integer[]::new);
  }

  public static Long[] wrap(long[] primitiveArray) {
    return Arrays.stream(primitiveArray).boxed().toArray(Long[]::new);
  }

  public static Double[] wrap(double[] primitiveArray) {
    return Arrays.stream(primitiveArray).boxed().toArray(Double[]::new);
  }
}
