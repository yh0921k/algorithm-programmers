package solution.level1;

/**
 * 자연수 뒤집어 배열로 만들기
 */
public class Problem005 {
  public int[] solution(long n) {

    // Solution 01
    // Integer[] array = new StringBuilder(n+"").reverse().toString().chars().mapToObj(c->c-48).toArray(Integer[]::new);
    // return Arrays.stream(array).mapToInt(Integer::intValue).toArray();


    // Solution 02
    // List<Integer> numberList = new ArrayList<>();
    // while(n > 0) {
    //   numberList.add((int)(n % 10));
    //   n /= 10;
    // }
    //
    // return numberList.stream().mapToInt(Integer::intValue).toArray();

    // Solution 03
    String number = String.valueOf(n);
    int size = number.length();

    int[] result = new int[size];
    for(int i = 0; i < size; i++) {
      result[i] = (int)(n % 10);
      n /= 10;
    }

    return result;
  }
}