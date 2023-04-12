package q;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class q9 {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        List<Integer> list2 = new ArrayList<>();

        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);

        boolean isEqual = Objects.equals(list1, list2);

        System.out.println("List1 and List2 are equal: " + isEqual);
    }
}

