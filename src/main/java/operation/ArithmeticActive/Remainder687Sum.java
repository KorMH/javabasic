package operation.ArithmeticActive;

public class Remainder687Sum {

  public static void main(String[] args) {
    int num = 687;
    int a = num % 10;
    System.out.println("a : " + a);
    num = num / 10;
    System.out.println("num : " + num);
    int b = num % 10;
    System.out.println("b : " + b);
    num = num / 10;
    System.out.println("num : " +num);
    int c = num % 10;
    System.out.println("c : " + c);
    System.out.println(a + b + c);
  }

}
