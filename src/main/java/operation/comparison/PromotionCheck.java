package operation.comparison;

public class PromotionCheck {
  public static void main(String[] args) {
    int yearsOfExp = 8;
    int numOfProj = 12;

    boolean isPromotion = yearsOfExp > 5 || numOfProj > 10;
    System.out.printf("팀장 승ㅈ인 가능 여부 : %b", isPromotion);
  }

}
