package solution.level2;

import java.util.Stack;

/*
 * 올바른 괄호
 */
public class Problem004 {
  public boolean solution(String s) {
    Stack<Character> stack = new Stack<>();

    for (char letter : s.toCharArray()) {
      if (!stack.isEmpty() && stack.peek() == '(' && letter == ')') {
        stack.pop();
        continue;
      }
      stack.push(letter);
    }

    return stack.isEmpty();
  }
}
