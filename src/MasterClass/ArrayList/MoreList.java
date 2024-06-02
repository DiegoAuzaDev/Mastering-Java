package MasterClass.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreList {

    public static void main(String[] args) {

        String[] items = {"apples", "bananas", "milk", "eggs"};

        List<String> list = List.of(items);
        System.out.println(list);

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");
        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(
                List.of("pickles", "mustard", "cheese")
        );

        System.out.println(nextList);


        groceries.addAll(nextList);

        System.out.println(groceries);

        System.out.println("Third items = " + groceries.get(2));

        if (groceries.contains("mustard")){
            System.out.println("List contains mustard");
        }

        groceries.add("mustard");

        System.out.println(groceries.indexOf("mustard"));
        System.out.println(groceries.lastIndexOf("mustard"));

        System.out.println(groceries);

        groceries.remove(1);
        groceries.remove("mustard");
        System.out.println(groceries);

        groceries.removeAll(List.of("apples", "eggs"));
        System.out.println(groceries);

        groceries.clear();

        System.out.println(groceries);

        groceries.addAll(List.of("apples", "milk", "mustard", "cheese"));

        groceries.addAll(Arrays.asList("eggs", "pickles", "mustard", "ham"));


        System.out.println(groceries);


        groceries.sort(Comparator.naturalOrder());

        System.out.println(groceries);

        groceries.sort(Comparator.reverseOrder());

        System.out.println(groceries);


        var groceryArray = groceries.toArray( new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));

    }

}
