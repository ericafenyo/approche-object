package listes;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestListeInt {
  public static void main(String[] args) {
    ArrayList<Integer> lists = new ArrayList<>(List.of(-1, 5, 7, 3, -2, 4, 8, 5));


    System.out.println("Original array");
    System.out.println(lists);
    System.out.println("Size of the array: " + lists.size());

    int max = Collections.max(lists);
    System.out.println("The max value is: " + max);

    int min = Collections.min(lists);
    int indexOfMin = lists.indexOf(min);
    System.out.println("Remove the min value: " + min);
    lists.remove(indexOfMin);
    System.out.println("The remaining array elements is: ");
    System.out.println(lists);

    Iterator<Integer> iterator = lists.iterator();

    while (iterator.hasNext()) {
      int element = iterator.next();
      if (element < 0) {
        int index = lists.indexOf(element);
        lists.set(index, element * -1);
      }
    }


    System.out.println("Array elements after making all positive: ");
    System.out.println(lists);

  }
}
