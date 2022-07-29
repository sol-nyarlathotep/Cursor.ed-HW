package L5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MyList<T extends Comparable> {
//  private Comparable[] list = new Comparable[0];
    private List<Comparable> list = new ArrayList<>();
  public MyList<T> add(T param) {
    list.add(param);
    return this;
  }

  public T largest() {
    T largestElement = null;
    Optional<Comparable> maxAsOptional =
        list.stream()
            .reduce(
                (acc, com) -> {
                  if (com.compareTo(acc) > 0) {
                    return com;
                  }
                  return acc;
                });
    if (maxAsOptional.isPresent()) {
      largestElement = (T) maxAsOptional.get();
    }
    return largestElement;
  }

  public T smallest() {
    T smallestElement = null;
    Optional<Comparable> minAsOptional =
        list.stream()
            .reduce(
                (acc, com) -> {
                  if (com.compareTo(acc) < 0) {
                    return com;
                  }
                  return acc;
                });
    if (minAsOptional.isPresent()) {
      smallestElement = (T) minAsOptional.get();
    }
    return smallestElement;
  }

  public void printList() {
    System.out.println(this);
  }

  @Override
  public String toString() {
    return list.toString();
  }
}
