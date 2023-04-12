package q;

import java.util.ArrayList;
import java.util.List;

public class q2 {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(2);

        System.out.println("List before removal: " + numbers);

        numbers.removeAll(List.of(2));

        System.out.println("List after removal: " + numbers);
    }
}

