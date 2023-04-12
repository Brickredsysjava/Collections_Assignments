package q;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class q10 {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(36);
        numbers.add(42);
        numbers.add(45);
        numbers.add(5);

        Collections.sort(numbers);

        int secondLargest = numbers.get(numbers.size() - 2);

        System.out.println("Second largest element: " + secondLargest);
    }
}
