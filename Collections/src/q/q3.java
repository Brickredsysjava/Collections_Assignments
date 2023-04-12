package q;
import java.util.ArrayList;
        import java.util.Comparator;
        import java.util.List;

public class q3 {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");

        fruits.sort(Comparator.naturalOrder());

        System.out.println("List after sorting: " + fruits);
    }
}

