package L5;

import java.util.Arrays;
import java.util.Optional;

public class ExtremumFinder <T extends Comparable>{
    private T[] array;

    public ExtremumFinder(T[] array) {
        this.array = array;
    }

    public T lowest(){
        T smallestElement = null;
        Optional<T> minAsOptional = Arrays.stream(array).reduce((acc,com) -> {
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

    public T highest(){
        T largestElement = null;
        Optional<T> maxAsOptional =
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

    @Override
    public String toString() {
        return String.format("Array: %s\nHighest el: %s\nLowest es: %s", Arrays.toString(array) ,highest(), lowest());
    }
}
