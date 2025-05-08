package Variable.MemberVariable;

public class SpaceInvadersMemberVariableTest2 {

  public static void main(String[] args) {
    SpaceInvadersMemberVariable simv = new SpaceInvadersMemberVariable();
    System.out.println(simv.location);

    simv.moveLeft();
    System.out.println(simv.location);

    simv.moveLeft();
    System.out.println(simv.location);

  }

}
