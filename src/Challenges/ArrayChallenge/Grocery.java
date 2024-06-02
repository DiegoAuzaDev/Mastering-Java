package Challenges.ArrayChallenge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Grocery {

    private ArrayList<String> groceryItems = new ArrayList<>();

    public Grocery(String ... initialItems){
        groceryItems.addAll(List.of(initialItems));
    }

    public ArrayList<String> getGroceryItems() {
        groceryItems.sort(Comparator.naturalOrder());
        return  groceryItems;
    }

    public void addItemsToLIst  (String... newItems){
        for (String newItem : newItems) {
            if (!groceryItems.contains(newItem)) {
                groceryItems.add(newItem);
            }
        }
    }

    public  void removeItemsFromList ( String... removeItems){
        for (String removeItem : removeItems){
            groceryItems.remove(removeItem);
        }
    }

    public void clearList (){
        groceryItems.clear();
    }

    @Override
    public String toString() {
        groceryItems.sort(Comparator.naturalOrder());
       return "You Items are the following : " + groceryItems.toString();
    }
}
