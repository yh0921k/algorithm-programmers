package solution.level1;

/*
 * 없는 숫자 더하기
 */
public class Problem022 {
  public int solution(int[] numbers) {
    int sumOfNumbers = 0;
    for (int number : numbers) {
      sumOfNumbers += number;
    }

    return 45 - sumOfNumbers;
  }
}
