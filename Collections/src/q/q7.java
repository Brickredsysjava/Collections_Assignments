package q;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class q7 {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        int max = Collections.max(numbers);
        int min = Collections.min(numbers);

        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}

