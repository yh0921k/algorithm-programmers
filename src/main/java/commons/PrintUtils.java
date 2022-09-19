package commons;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class PrintUtils<T> {
  public static void print(Object data) {
    System.out.println("Result : " + data);
  }

  public static void print(int[] array) {
    Integer[] boxedArray = PrimitiveArrayWrapper.wrap(array);
    print(boxedArray);
  }

  public static void print(long[] array) {
    Long[] boxedArray = PrimitiveArrayWrapper.wrap(array);
    print(boxedArray);
  }

  public static void print(double[] array) {
    Double[] boxedArray = PrimitiveArrayWrapper.wrap(array);
    print(boxedArray);
  }

  public static <T> void print(List<T> list) {
    Iterator<T> iterator = list.listIterator();
    printIterator(iterator);
  }

  public static <T> void print(T[] array) {
    Iterator<T> iterator = Arrays.stream(array).iterator();
    printIterator(iterator);
  }

  private static <T> void printIterator(Iterator<T> iterator) {
    System.out.print("\nIterator : [");
    while(iterator.hasNext()) {
      System.out.print(iterator.next());
      if(iterator.hasNext()) {
        System.out.print(", ");
      }
    }
    System.out.print("]\n");
  }
}
