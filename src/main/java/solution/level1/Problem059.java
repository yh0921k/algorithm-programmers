package solution.level1;

import java.util.Stack;

/*
 * 크레인 인형뽑기 게임
 */
public class Problem059 {
  public int solution(int[][] board, int[] moves) {
    Stack<Integer>[] boardStacks = new Stack[board[0].length];
    for (int i = 0; i < board.length; i++) {
      boardStacks[i] = new Stack<>();
      for (int j = board[0].length - 1; j >= 0; j--) {
        if (board[j][i] != 0) {
          boardStacks[i].push(board[j][i]);
        }
      }
    }

    Stack<Integer> bracket = new Stack<>();
    bracket.push(-1);

    int result = 0;
    for (int move : moves) {
      if(boardStacks[move - 1].isEmpty()) {
        continue;
      }

      int doll = boardStacks[move - 1].pop();
      if (bracket.peek() == doll) {
        result += 2;
        bracket.pop();
        continue;
      }
      bracket.push(doll);
    }

    return result;
  }
}
