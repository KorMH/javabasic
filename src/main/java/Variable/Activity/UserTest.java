package Variable.Activity;

public class UserTest {
  public static void main(String[] args) {
    User user = new User();
    user.name = "김경록";
    user.PhoneNumber  = "010-0000-0000";
    user.age = 37;

    System.out.println("이름: " + user.name);
    System.out.println("휴대폰 번호: " + user.PhoneNumber);
    System.out.println("나이: " + user.name);
  }

}
