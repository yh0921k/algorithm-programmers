package solution.level1;

/*
 * 키패드 누르기
 */
public class Problem058 {
  private final String[][] keyMap = {{"1", "4", "7", "*"}, {"2", "5", "8", "0"}, {"3", "6", "9", "#"}};

  public String solution(int[] numbers, String hand) {
    Hands hands = new Hands(hand, new Position(0, 3), new Position(2, 3));
    StringBuilder builder = new StringBuilder();
    for (int number : numbers) {
      builder.append(hands.applyDistance(keyMap, number));
    }
    return builder.toString();
  }
}

class Hands {
  private final String main;
  private final Position left;
  private final Position right;

  public Hands(String main, Position left, Position right) {
    this.main = main;
    this.left = left;
    this.right = right;
  }

  public String applyDistance(String[][] keyMap, int number) {
    if (contains(keyMap[0], number)) {
      left.changePosition(0, leftY(keyMap[0], number));
      return "L";
    }
    if (contains(keyMap[2], number)) {
      right.changePosition(2, rightY(keyMap[2], number));
      return "R";
    }

    int distanceFromLeft = distanceFromLeft(keyMap, number);
    int distanceFromRight = distanceFromRight(keyMap, number);

    if (distanceFromLeft > distanceFromRight) {
      right.moveTo(keyMap[1], number);
      return "R";
    }
    if (distanceFromLeft < distanceFromRight) {
      left.moveTo(keyMap[1], number);
      return "L";
    }

    if(main.equals("left")) {
      left.moveTo(keyMap[1], number);
    }
    if(main.equals("right")) {
      right.moveTo(keyMap[1], number);
    }

    return main.toUpperCase().substring(0, 1);
  }

  private boolean contains(String[] vertical, int number) {
    for (String key : vertical) {
      if (key.equals(String.valueOf(number))) {
        return true;
      }
    }
    return false;
  }

  private int rightY(String[] vertical, int number) {
    return searchPosition(vertical, number, right);
  }

  private int leftY(String[] vertical, int number) {
    return searchPosition(vertical, number, left);
  }

  private int searchPosition(String[] vertical, int number, Position hand) {
    for (int i = 0; i < vertical.length; i++) {
      if (vertical[i].equals(String.valueOf(number))) {
        return i;
      }
    }
    return hand.getY();
  }

  private int distanceFromLeft(String[][] keyMap, int number) {
    int currentX = left.getX();
    int distance = 0;

    if (currentX == 0) {
      distance++;
    }

    return distance + searchDistance(keyMap[1], number, left);
  }

  private int distanceFromRight(String[][] keyMap, int number) {
    int currentX = right.getX();
    int distance = 0;

    if (currentX == 2) {
      distance++;
    }

    return distance + searchDistance(keyMap[1], number, right);
  }

  private int searchDistance(String[] vertical, int number, Position hand) {
    int distance = 0;
    for (int i = 0; i < vertical.length; i++) {
      if (vertical[i].equals(String.valueOf(number))) {
        distance = Math.abs(i - hand.getY());
      }
    }

    return distance;
  }
}

class Position {
  private int x;
  private int y;

  public Position(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public void changePosition(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public void moveTo(String[] vertical, int number) {
    this.x = 1;

    for (int i = 0; i < vertical.length; i++) {
      if(vertical[i].equals(String.valueOf(number))) {
        this.y = i;
      }
    }
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }
}