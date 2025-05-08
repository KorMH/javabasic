package Variable.ScannerAndVariable;

import java.util.Scanner;

public class StoreValueAndPrint {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int first = sc.nextInt();
    int second = sc.nextInt();

    System.out.printf("%d과(와) %d의 합은 %d 입니다.", first, second, first + second);

  }

}
