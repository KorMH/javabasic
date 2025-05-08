package Variable.TypeCasting;

public class StringPlusDecimal {
  public static void main(String[] args) {
    String val1 = "1.11111111";
    String val2 = "2.22222222";

    double result = Double.parseDouble(val1) + Double.parseDouble(val2);

    System.out.println(result);



  }

}
