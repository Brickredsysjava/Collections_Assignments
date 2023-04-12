package q;
import java.util.ArrayList;
import java.util.List;

public class q8 {

    public static void main(String[] args) {

        List<Integer> sourceList = new ArrayList<>();

        sourceList.add(1);
        sourceList.add(2);
        sourceList.add(3);
        sourceList.add(4);

        List<Integer> destinationList = new ArrayList<>(sourceList);

        System.out.println("Source list: " + sourceList);
        System.out.println("Destination list: " + destinationList);
    }
}
