package Array;

import java.util.Scanner;

public class ArraySplitNextLine {

  public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    String input = sc.nextLine();
    String[] numbers = input.split(" ");

    System.out.println(numbers[0] + numbers[1] + numbers[2]);
  }

}
