package L5;

import java.util.Arrays;
import java.util.Optional;

public class MyList<T extends Comparable> {
  private Comparable[] array = new Comparable[0];
  public MyList<T> add(T param) {
    array = Arrays.copyOf(array, array.length + 1);
    array[array.length - 1] = param;
    return this;
  }

  public T largest() {
    T largestElement = null;
    Optional<Comparable> maxAsOptional =
        Arrays.stream(array)
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
        Arrays.stream(array)
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
    System.out.println(Arrays.toString(this.array));
  }

  @Override
  public String toString() {
    return Arrays.toString(array);
  }
}
