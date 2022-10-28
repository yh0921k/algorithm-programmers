package solution.level1;

import java.util.Stack;

/*
 * 햄버거 만들기
 */
public class Problem053 {
  public int solution(int[] ingredient) {
    Stack<Integer> stack = new Stack<>();

    int result = 0;
    for (int i = 0; i < ingredient.length; i++) {
      stack.push(ingredient[i]);

      if(stack.size() >= 4 && isValidPattern(stack)) {
        removePattern(stack);
        result++;
      }
    }

    return result;
  }

  private void removePattern(Stack<Integer> stack) {
    for (int i = 0; i < 4; i++) {
      stack.pop();
    }
  }

  private boolean isValidPattern(Stack<Integer> stack) {
    int lastIndex = stack.size() - 1;
    if (stack.get(lastIndex) == 1
        && stack.get(lastIndex - 1) == 3
        && stack.get(lastIndex - 2) == 2
        && stack.get(lastIndex - 3) == 1) {
      return true;
    }
    return false;
  }
}
