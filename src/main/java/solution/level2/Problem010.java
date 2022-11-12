package solution.level2;

import java.util.Stack;

/*
 * 짝지어 제거하기
 */
public class Problem010 {
  public int solution(String s) {
    Stack<Character> letters = new Stack<>();

    for (char letter : s.toCharArray()) {
      if (!letters.isEmpty() && letters.peek() == letter) {
        letters.pop();
        continue;
      }
      letters.push(letter);
    }
    return letters.isEmpty() ? 1 : 0;
  }
}
