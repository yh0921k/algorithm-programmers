package solution.level1;

/*
 * 부족한 금액 계산하기
 */
public class Problem028 {
  public long solution(int price, int money, int count) {
    long sum = 0;
    for (int i = 1; i <= count; i++) {
      sum += (price * i);
    }

    long diff = (sum - (long)money);
    return diff > 0 ? diff : 0;
  }
}
