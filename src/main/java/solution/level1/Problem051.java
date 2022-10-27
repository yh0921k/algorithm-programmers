package solution.level1;

/*
 * 소수 만들기
 */
public class Problem051 {
  public int solution(int[] nums) {
    int size = nums.length;
    int count = 0;

    for (int i = 0; i < size; i++) {
      for (int j = i+1; j < size; j++) {
        for (int k = j+1; k < size; k++) {
          if(isPrime(nums[i] + nums[j] + nums[k])) {
            count++;
          }
        }
      }
    }
    return count;
  }

  public boolean isPrime(int number) {
    if(number % 2 == 0) {
      return false;
    }

    for (int i = 2; i < (int)Math.sqrt(number); i++) {
      if(number % i == 0) {
        return false;
      }
    }

    return true;
  }
}
