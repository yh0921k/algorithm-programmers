package solution.level1;

import java.util.Scanner;

/*
 * 직사각형 별찍기
 */
public class Problem029 {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int width = sc.nextInt();
      int height = sc.nextInt();

    StringBuilder widthBuilder = new StringBuilder();
    for (int i = 0; i < width; i++) {
        widthBuilder.append("*");
    }

    String widthValue = widthBuilder.toString();
    StringBuilder heightBuilder = new StringBuilder();
    for (int i = 0; i < height; i++) {
        heightBuilder.append(widthValue);
        if(i < height - 1) {
            heightBuilder.append("\n");
        }
    }

    System.out.print(heightBuilder.toString());
  }
}
