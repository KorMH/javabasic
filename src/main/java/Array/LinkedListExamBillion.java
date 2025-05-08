package Array;

import java.util.LinkedList;

public class LinkedListExamBillion {

  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList();
    for (long i = 0; i < 1_000_000_000; i++){
      linkedList.add(1);
    }
  }

}
