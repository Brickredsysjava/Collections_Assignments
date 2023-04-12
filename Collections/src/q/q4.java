package q;

import java.util.ArrayList;
import java.util.List;

public class q4 {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.println("List before removal: " + numbers);

        numbers.clear();

        System.out.println("List after removal: " + numbers);
    }
}

